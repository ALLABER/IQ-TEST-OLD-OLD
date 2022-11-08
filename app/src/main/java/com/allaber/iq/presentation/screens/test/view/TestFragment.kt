package com.allaber.iq.presentation.screens.test.view

import android.os.Bundle
import android.text.TextUtils.replace
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.allaber.iq.R
import com.allaber.iq.databinding.FragmentResultBinding
import com.allaber.iq.databinding.FragmentStartBinding
import com.allaber.iq.databinding.FragmentTestBinding
import com.allaber.iq.presentation.screens.navigation.view.FlowFragment
import com.allaber.iq.presentation.screens.result.view.ResultFragment

class TestFragment : Fragment(R.layout.fragment_test) {

    private val binding by viewBinding(
        FragmentTestBinding::bind
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        with(binding) {
            btnSwitchToResultFragment.setOnClickListener {
                switchFragment(ResultFragment.newInstance())
            }
        }
    }

    private fun switchFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction().replace(R.id.flowContainer, fragment).commit()
    }

    companion object {
        fun newInstance() = TestFragment()
    }
}