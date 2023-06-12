package com.example.foodstore.api

import com.example.foodstore.pojo.CategoriesResponse
import com.example.foodstore.pojo.Dishes
import com.example.foodstore.pojo.DishesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("058729bd-1402-4578-88de-265481fd7d54")
    suspend fun getCategoriesList() : CategoriesResponse

    @GET("aba7ecaa-0a70-453b-b62d-0e326c859b3b")
    suspend fun getDishes() : DishesResponse

}