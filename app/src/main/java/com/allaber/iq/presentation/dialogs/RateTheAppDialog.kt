package com.allaber.iq.presentation.dialogs

import androidx.fragment.app.DialogFragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.allaber.iq.R
import com.allaber.iq.databinding.DialogRateTheAppBinding
import com.allaber.iq.presentation.screens.start.view.StartFragment

class RateTheAppDialog : DialogFragment(R.layout.dialog_rate_the_app) {

    private val binding by viewBinding(
        DialogRateTheAppBinding::bind
    )

    companion object {
        fun newInstance() = RateTheAppDialog()
    }
}