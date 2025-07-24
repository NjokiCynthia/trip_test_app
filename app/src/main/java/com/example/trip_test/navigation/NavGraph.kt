package com.example.trip_test.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trip_test.ui.screens.Home
import com.example.trip_test.ui.screens.SplashScreen

@Composable
fun NavGraph() {

    var navController = rememberNavController()

    NavHost(navController = navController, startDestination = "splash_screen"){

        composable("splash_screen"){
            SplashScreen {navController.navigate("home")
            {popUpTo("splash_screen"){inclusive=true} }  }
        }
       composable("home"){
           Home()
       }
    }
}