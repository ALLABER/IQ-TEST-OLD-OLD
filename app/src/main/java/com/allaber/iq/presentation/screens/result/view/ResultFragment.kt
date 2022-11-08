package com.allaber.iq.presentation.screens.result.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.allaber.iq.R
import com.allaber.iq.databinding.FragmentResultBinding
import com.allaber.iq.databinding.FragmentStartBinding
import com.allaber.iq.databinding.FragmentTestBinding
import com.allaber.iq.presentation.screens.start.view.StartFragment

class ResultFragment : Fragment(R.layout.fragment_result) {

    private val binding: FragmentResultBinding by viewBinding(
        FragmentResultBinding::bind
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        with(binding) {
            btnSwitchToStartFragment.setOnClickListener {
                switchFragment(StartFragment.newInstance())
            }
        }
    }

    private fun switchFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction().replace(R.id.flowContainer, fragment).commit()
    }

    companion object {
        fun newInstance() = ResultFragment()
    }
}