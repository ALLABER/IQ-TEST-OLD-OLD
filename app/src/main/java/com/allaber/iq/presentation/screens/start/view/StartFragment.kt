package com.allaber.iq.presentation.screens.start.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.allaber.iq.R
import com.allaber.iq.databinding.FragmentStartBinding
import com.allaber.iq.presentation.screens.test.view.TestFragment

class StartFragment : Fragment(R.layout.fragment_start) {

    private val binding: FragmentStartBinding by viewBinding(
        FragmentStartBinding::bind
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        with(binding) {
            btnSwitchToTestFragment.setOnClickListener {
                switchFragment(TestFragment.newInstance())
            }
        }
    }

    private fun switchFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction().replace(R.id.flowContainer, fragment).commit()
    }

    companion object {
        fun newInstance() = StartFragment()
    }
}