package com.allaber.iq.presentation.dialogs

import androidx.fragment.app.DialogFragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.allaber.iq.R
import com.allaber.iq.databinding.DialogConfirmExitBinding
import com.allaber.iq.databinding.DialogSwitchLanguageBinding
import com.allaber.iq.presentation.screens.start.view.StartFragment

class SwitchLanguageDialog : DialogFragment(R.layout.dialog_switch_language) {

    private val binding by viewBinding(
        DialogSwitchLanguageBinding::bind
    )

    companion object {
        fun newInstance() = SwitchLanguageDialog()
    }
}