package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.LocalIndication
import androidx.compose.material3.ripple
import androidx.compose.runtime.CompositionLocalProvider

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CompositionLocalProvider(LocalIndication provides ripple()) {
                App()
            }
        }
    }
}
