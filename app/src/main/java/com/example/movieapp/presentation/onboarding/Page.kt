package com.example.movieapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.movieapp.R

data class Page(
    val title: String,
    val description : String,
    @DrawableRes val image: Int
)


val pages = listOf(
    Page(
        title = "Welcome to NewsConnect!",
        description = "Stay informed with the latest news from around the world. NewsConnect brings you real-time updates on current events, politics, sports, entertainment, and more.",
        image = R.drawable.ic_launcher_background
    ),

    Page(
        title = "Stay Updated, Anywhere, Anytime",
        description = "Get notifications on breaking news and trending stories. With NewsConnect, you'll never miss an important update, whether you're at home or on the go.",
        image = R.drawable.ic_launcher_background
    ),
    Page(
        title = "Get Started with NewsConnect",
        description = "Dive into a world of news tailored just for you. Tap the button below to begin exploring!",
        image = R.drawable.ic_launcher_background
    )

)
