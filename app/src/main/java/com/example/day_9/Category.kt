package com.example.day_9

import android.R

data class Category(val idCategory:String,
                    val strCategory: String,
                    val strCategoryThumb : String,
                    val strCategoryDescription: String)        // in this () we decleare variable name ane type

 // Response wrapper (API returns list inside "categories")
data class CategorisResponse(val categories : List<Category>)


