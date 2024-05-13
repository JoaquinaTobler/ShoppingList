package com.example.lunchtray.ui.order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.lunchtray.R
import com.example.lunchtray.databinding.FragmentStartBinding

class StartFragment : Fragment() {

        // Binding object instance corresponding to the fragment_start_order.xml layout
        // This property is non-null between the onCreateView() and onDestroyView() lifecycle callbacks,
        // when the view hierarchy is attached to the fragment.
        private var _binding: FragmentStartBinding? = null

        // This property is only valid between onCreateView and
        // onDestroyView.
        private val binding get() = _binding!!

        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {
            _binding = FragmentStartBinding.inflate(inflater, container, false)
            val root: View = binding.root
            // Navigate to chosselunch screen
            binding.button2.setOnClickListener {
                // TODO: navigate to the chooseLunchFragment
                findNavController().navigate(R.id.action_startFragment_to_chooseLunchFragment)

            }
            binding.button3.setOnClickListener {
                // TODO: navigate to the chooseLunchFragment
                findNavController().navigate(R.id.action_startFragment_to_tuesdayLunchFragment)

            }

            binding.button4.setOnClickListener {
                // TODO: navigate to the chooseLunchFragment
                findNavController().navigate(R.id.action_startFragment_to_wednesdayLunchFragment)

            }

            binding.button5.setOnClickListener {
                // TODO: navigate to the chooseLunchFragment
                findNavController().navigate(R.id.action_startFragment_to_thursdayLunchFragment)

            }

            binding.button6.setOnClickListener {
                // TODO: navigate to the chooseLunchFragment
                findNavController().navigate(R.id.action_startFragment_to_fridayLunchFragment)

            }

            return root
        }

        /**
         * This fragment lifecycle method is called when the view hierarchy associated with the fragment
         * is being removed. As a result, clear out the binding object.
         */
        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }
    }