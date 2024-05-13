package com.example.lunchtray.ui.order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.lunchtray.R
import com.example.lunchtray.databinding.FragmentFridayDinnerBinding
import com.example.lunchtray.databinding.FragmentThursdayDinnerBinding
import com.example.lunchtray.model.OrderViewModel

class FridayDinnerFragment : Fragment(){

    private var _binding: FragmentFridayDinnerBinding?=null

    private val binding get() = _binding!!

    private val sharedViewModel: OrderViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFridayDinnerBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = sharedViewModel

            // TODO: initialize the FridayDinnerFragment variables
            //Bind var created at xml layout with fragment instance
            fridayDinnerFragment = this@FridayDinnerFragment

        }
    }

    /**
     * Navigate to the side menu fragment.
     */
    fun goToNextScreen() {
        // TODO: Navigate to the fridayResumeFragment
        findNavController().navigate(R.id.action_fridayDinnerFragment_to_fridayResumeFragment)
    }

    /**
     * Cancel the order and start over.
     */
    fun cancelOrder() {
        // TODO: Reset order in view model
        sharedViewModel.resetOrder()

        // TODO: Navigate back to the StartFragment to start over
        findNavController().navigate(R.id.action_fridayDinnerFragment_to_startFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
