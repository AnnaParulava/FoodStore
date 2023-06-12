package com.example.foodstore.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CategoriesResponse(
    @SerializedName("сategories")
    @Expose
    val categories: List<Category>? = null
)
