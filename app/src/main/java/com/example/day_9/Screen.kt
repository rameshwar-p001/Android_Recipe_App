package com.example.day_9

sealed class Screen(val route: String) {

    object RecipeScreen: Screen("recipescreen")
    object DetailScreen: Screen("detailscreen")

}