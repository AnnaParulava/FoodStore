package com.example.foodstore

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.foodstore.api.ApiFactory
import com.example.foodstore.api.ApiFactory.apiService
import com.example.foodstore.api.ApiService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext


class MainActivity : AppCompatActivity() {

    private val job = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + job)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch {

            val responseCategory = apiService.getCategoriesList()
            Log.d("AAA", "Category: ${responseCategory}")
            Log.d("AAA", "Category: ${apiService.getDishes()}")
        }

    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
