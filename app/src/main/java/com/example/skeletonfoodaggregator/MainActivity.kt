package com.example.skeletonfoodaggregator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/***
 * Requirements:
 * Let's assume we are a price aggregator for food delivery apps.
 * We should be able to search for a dish and display the results from all the food delivery apps we support.
 *
 * We need to call 2 APIs from 2 different delivery providers and display the results.
 *
 * Requirements:
 * - listen to the search input from the EditText and trigger the API calls based on the input
 * - have a timeout between key presses to not trigger the API calls too fast
 * - display the results from the API call as they come (no need to wait for both to finish) in the recycler view
 *
 */