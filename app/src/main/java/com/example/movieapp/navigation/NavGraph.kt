package com.example.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.movieapp.presentation.navigator.MovieNavigator
import com.example.movieapp.presentation.onboarding.OnBoardingScreen
import com.example.movieapp.presentation.onboarding.OnBoardingViewModel
import okhttp3.Route

@Composable
fun NavGraph(
    startDestination: String
) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        navigation(
            route = Screens.AppStartNavigation.route,
            startDestination = Screens.OnBoardingScreen.route
        ) {
            composable(route = Screens.OnBoardingScreen.route) {
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(event = viewModel::onEvent)
            }
        }

        navigation(
            route = Screens.NewsNavigation.route,
            startDestination = Screens.NewsNavigatorScreen.route
        ) {
            composable(route = Screens.NewsNavigatorScreen.route) {
                MovieNavigator()

            }
        }
    }
}