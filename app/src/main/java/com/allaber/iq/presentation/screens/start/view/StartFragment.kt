package com.allaber.iq.presentation.screens.start.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.allaber.iq.R
import com.allaber.iq.databinding.FragmentStartBinding
import com.allaber.iq.presentation.dialogs.ConfirmExitDialog
import com.allaber.iq.presentation.dialogs.RateTheAppDialog
import com.allaber.iq.presentation.dialogs.SwitchLanguageDialog
import com.allaber.iq.presentation.screens.test.view.TestFragment

class StartFragment : Fragment(R.layout.fragment_start) {

    private val binding by viewBinding(
        FragmentStartBinding::bind
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        with(binding) {
            ivSwitchLanguage.setOnClickListener {
                showSwitchLanguageDialog()
            }

            ivExitTheApp.setOnClickListener {
                showConfirmExitDialog()
            }

            tvStartTesting.setOnClickListener {
                switchTestFragment()
            }

            tvRateTheApp.setOnClickListener {
                showRateTheAppDialog()
            }
        }
    }

    private fun showSwitchLanguageDialog() {
        val switchLanguageDialog = SwitchLanguageDialog.newInstance()
        switchLanguageDialog.show(parentFragmentManager, "SwitchLanguageDialog")
    }

    private fun showConfirmExitDialog() {
        val confirmExitDialog = ConfirmExitDialog.newInstance()
        confirmExitDialog.show(parentFragmentManager, "ConfirmExitDialog")
    }

    private fun switchTestFragment() {
        parentFragmentManager.beginTransaction()
            .replace(R.id.flowContainer, TestFragment.newInstance()).commit()
    }

    private fun showRateTheAppDialog() {
        val rateTheAppDialog = RateTheAppDialog.newInstance()
        rateTheAppDialog.show(parentFragmentManager, "RateTheAppDialog")
    }

    companion object {
        fun newInstance() = StartFragment()
    }
}