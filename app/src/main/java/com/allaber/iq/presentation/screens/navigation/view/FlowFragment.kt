package com.allaber.iq.presentation.screens.navigation.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.allaber.iq.R

class FlowFragment : Fragment(R.layout.fragment_flow) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        fun newInstance() = FlowFragment()
    }
}