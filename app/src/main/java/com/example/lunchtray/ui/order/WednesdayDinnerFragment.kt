package com.example.lunchtray.ui.order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.lunchtray.R
import com.example.lunchtray.databinding.FragmentWednesdayDinnerBinding
import com.example.lunchtray.model.OrderViewModel

class WednesdayDinnerFragment : Fragment(){

    private var _binding: FragmentWednesdayDinnerBinding?=null

    private val binding get() = _binding!!

    private val sharedViewModel: OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWednesdayDinnerBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel

            // TODO: initialize the WednesdayDinnerFragment variables
            //Bind var created at xml layout with fragment instance
            wednesdayDinnerFragment = this@WednesdayDinnerFragment

        }
    }
    /**
     * Navigate to the side menu fragment.
     */
    fun goToNextScreen() {
        // TODO: Navigate to the WednesdayResumeFragment
        findNavController().navigate(R.id.action_wednesdayDinnerFragment_to_wednesdayResumeFragment)
    }
    /**
     * Cancel the order and start over.
     */
    fun cancelOrder() {
        // TODO: Reset order in view model
        sharedViewModel.resetOrder()

        // TODO: Navigate back to the StartFragment to start over
        findNavController().navigate(R.id.action_wednesdayDinnerFragment_to_startFragment)
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


