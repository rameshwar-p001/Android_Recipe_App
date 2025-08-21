package com.example.day_9

import android.R
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Category(val idCategory:String,
                    val strCategory: String,
                    val strCategoryThumb : String,
                    val strCategoryDescription: String) : Parcelable       // in this () we decleare variable name ane type

 // Response wrapper (API returns list inside "categories")
data class CategorisResponse(val categories : List<Category>)


