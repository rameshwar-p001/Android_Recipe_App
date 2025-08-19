package com.example.day_9

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter


@Composable
fun RecipeScreen(modifier : Modifier= Modifier) {
    val recipeViewModel: MainViewModel= viewModel()
    val viewstate by recipeViewModel.categorieState


    Box(modifier = Modifier.fillMaxSize()){
        when{
            viewstate.loding ->{
                CircularProgressIndicator(modifier.align(Alignment.Center) )
            }
            viewstate.error != null ->{
                Text("Error Occurerd")
            }
            else ->{
                // Display Categuries
                CategoryScreen(categories = viewstate.list)

            }
        }
    }
}


@Composable

fun CategoryScreen (categories: List<Category>){
    LazyVerticalGrid(GridCells.Fixed(2), modifier = Modifier.fillMaxSize()) {
        items(categories) {
            category ->
            CategoryItem(category=category)
        }
    }
}


//how each item look likes
@Composable
fun CategoryItem(category: Category){
    Column(modifier = Modifier.padding(6.dp).fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Image(
            painter = rememberAsyncImagePainter(category.strCategoryThumb),
            contentDescription = null,
            modifier = Modifier.fillMaxWidth().aspectRatio(1f)
        )

        Text(
            text = category.strCategory,
            color = Color.White,
            style = TextStyle(fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}
