package com.example.trip_test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.trip_test.navigation.NavGraph
import com.example.trip_test.ui.theme.Trip_testTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Trip_testTheme {
                NavGraph()
                }
            }
        }
    }