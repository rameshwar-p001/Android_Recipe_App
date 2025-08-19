package com.example.day_9.ui.theme

import com.example.day_9.CategorisResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

 // Retrofit instance
private val retrofit= Retrofit.Builder().baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

// Service object
val recipeService=retrofit.create(ApiService::class.java)


// Interface for endpoints
interface ApiService{
    @GET("categories.php")
    suspend fun getCategories(): CategorisResponse    //Suspend function we use here
}



