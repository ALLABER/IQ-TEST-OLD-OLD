package com.allaber.iq.presentation.screens.navigation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.allaber.iq.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, FlowFragment.newInstance()).commit()
    }

    override fun onBackPressed() {
    }
}