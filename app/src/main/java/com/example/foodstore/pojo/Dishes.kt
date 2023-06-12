package com.example.foodstore.pojo

data class Dishes(
    val id: Int,
    val name: String,
    val price: Int,
    val weight: Int,
    val description: String,
    val image_url: String,
    val tags: List<String>
)
