package com.example.day_9

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
//import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun RecipeApp(navController: NavHostController){
    val recipeViewModel: MainViewModel= viewModel()
    val viewState by recipeViewModel.categorieState

    NavHost(navController=navController,startDestination= Screen.RecipeScreen.route){
        composable(route= Screen.RecipeScreen.route){
           RecipeScreen(viewstate = viewState,navigateToDetails = {

//This part is responsible for passing data from the current screen to the detail screen.
//It utilizes the saveStateHandle, which is a component of the Compose navigation framework
               navController.currentBackStackEntry?.savedStateHandle?.set("cat",it)       //set has given which is a key and value
               navController.navigate(Screen.DetailScreen.route)
           })
        }
        composable(route= Screen.DetailScreen.route){
            val category=navController.previousBackStackEntry?.savedStateHandle?.
            get<Category>("cat")                 //like get also we give the key
                ?: Category("","","","")

            CategoryDetailScreen(category=category)
        }
    }
}
