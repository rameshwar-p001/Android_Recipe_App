package com.example.day_9

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.day_9.ui.theme.recipeService
import kotlinx.coroutines.launch


class MainViewModel : ViewModel() {

private val _categoriestate = mutableStateOf(RecipeState())
    val categorieState: State <RecipeState> = _categoriestate


    init {
        fetchCategories()
    }


    private fun fetchCategories(){
        viewModelScope.launch {
            try {
                val response= recipeService.getCategories()
                _categoriestate.value=_categoriestate.value.copy(
                    loding = false,
                    list = response.categories,
                    error = null
                )
            }catch(e: Exception){
                _categoriestate.value=_categoriestate.value.copy(
                    loding = false,
                    error = "Error Fetching Categorie ${e.message}"
                )
            }
        }
    }

    data class RecipeState(
        val loding: Boolean=true,
        val list: List<Category> = emptyList(),
        val error: String?=null                  //String? it means string is nullable
    )
}
