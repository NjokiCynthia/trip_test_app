package com.example.trip_test.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trip_test.ui.screens.Home
import com.example.trip_test.ui.screens.Launcher

@Composable
fun NavGraph() {

    var navController = rememberNavController()

    NavHost(navController = navController, startDestination = "launcher"){
       composable("launcher"){
           Launcher()
       }
        composable("home"){
            Home()
        }
    }



}