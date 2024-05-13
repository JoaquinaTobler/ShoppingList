package com.example.lunchtray.ui.order

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.lunchtray.R
import com.example.lunchtray.databinding.FragmentResumeWednesdayBinding
import com.example.lunchtray.model.OrderViewModel
import com.google.android.material.snackbar.Snackbar

class WednesdayResumeFragment : Fragment() {

    private var _binding: FragmentResumeWednesdayBinding? = null

    private val binding get() = _binding!!

    private val sharedViewModel: OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentResumeWednesdayBinding.inflate(inflater, container, false)
        val root = binding.root

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner

            // TODO: initialize the OrderViewModel and WednesdayResumeFragment variables

            viewModel = sharedViewModel

            wednesdayResumeFragment = this@WednesdayResumeFragment

        }
    }

    /**
     * Cancel the order and start over.
     */
    fun cancelOrder() {
        // TODO: Reset order in view model
        sharedViewModel.resetOrder()

        // TODO: Navigate back to the StartFragment to start over
        findNavController().navigate(R.id.action_wednesdayResumeFragment_to_startFragment)
    }
    // TODO: this is used in case the user wants to share the summary
    fun sendOrder() {
        val wednesdayResume = getString(
            R.string.shopping_list_wednesday,
            sharedViewModel.menulunch.value?.description.toString(),
            sharedViewModel.menudinner.value?.description.toString(),
        )
        // Create an ACTION_SEND implicit intent with order details in the intent extras
        val intent = Intent(Intent.ACTION_SEND)
            .setType("text/plain")
            .putExtra(Intent.EXTRA_SUBJECT, getString(R.string.shopping_list_wednesday))
            .putExtra(Intent.EXTRA_TEXT, wednesdayResume)

        // Check if there's an app that can handle this intent before launching it
        if (activity?.packageManager?.resolveActivity(intent, 0) != null) {
            // Start a new activity with the given intent (this may open the share dialog on a
            // device if multiple apps can handle this intent)
            startActivity(intent)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}