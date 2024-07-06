package com.example.movieapp.navigation

sealed class Screens(val route: String) {
    object OnBoardingScreen : Screens(route = "onBoardingScreen")

    object HomeScreen : Screens(route = "homeScreen")

    object SearchScreen : Screens(route = "searchScreen")

    object BookmarkScreen : Screens(route = "bookMarkScreen")

    object DetailsScreen : Screens(route = "detailsScreen")

    object AppStartNavigation : Screens(route = "appStartNavigation")

    object NewsNavigation : Screens(route = "newsNavigation")

    object NewsNavigatorScreen : Screens(route = "newsNavigator")
}