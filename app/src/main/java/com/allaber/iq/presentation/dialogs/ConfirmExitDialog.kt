package com.allaber.iq.presentation.dialogs

import androidx.fragment.app.DialogFragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.allaber.iq.R
import com.allaber.iq.databinding.DialogConfirmExitBinding
import com.allaber.iq.presentation.screens.start.view.StartFragment

class ConfirmExitDialog : DialogFragment(R.layout.dialog_confirm_exit) {

    private val binding by viewBinding(
        DialogConfirmExitBinding::bind
    )

    companion object {
        fun newInstance() = ConfirmExitDialog()
    }
}