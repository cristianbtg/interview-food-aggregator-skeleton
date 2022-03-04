package com.example.skeletonfoodaggregator.api

import com.example.skeletonfoodaggregator.model.Food
import io.reactivex.Single
import kotlinx.coroutines.delay
import java.util.concurrent.TimeUnit

object API {

    suspend fun getFirstApiResultsCoroutines(query: String): List<Food> {
        delay(500)
        return careemList.filter { it.name.contains(query) }
    }

    suspend fun getSecondApiResultsCoroutines(query: String): List<Food> {
        delay(1000)
        return talabatList.filter { it.name.contains(query) }
    }

    fun getFirstApiResultsRx(query: String): Single<List<Food>> {
        return Single.just(careemList.filter { it.name.contains(query) })
            .delay(500, TimeUnit.MILLISECONDS)
    }

    fun getSecondApiResultsRx(query: String): Single<List<Food>> {
        return Single.just(talabatList.filter { it.name.contains(query) })
            .delay(1000, TimeUnit.MILLISECONDS)
    }


    private val careemList = listOf(
        Food(name = "Pasta", price = 3, provider = "CareemNOW"),
        Food(name = "Pizza", price = 5, provider = "CareemNOW"),
        Food(name = "Burger", price = 3, provider = "CareemNOW"),
        Food(name = "Shawarma", price = 6, provider = "CareemNOW"),
        Food(name = "Falafel", price = 5, provider = "CareemNOW"),
        Food(name = "Hot-Dog", price = 7, provider = "CareemNOW"),
        Food(name = "Lentil soup", price = 2, provider = "CareemNOW"),
        Food(name = "Salad", price = 5, provider = "CareemNOW"),
        Food(name = "Fish", price = 6, provider = "CareemNOW"),
    )

    private val talabatList = listOf(
        Food(name = "Salad", price = 3, provider = "Talabat"),
        Food(name = "Pizza", price = 5, provider = "Talabat"),
        Food(name = "Hot-Dog", price = 5, provider = "Talabat"),
        Food(name = "Pasta", price = 4, provider = "Talabat"),
        Food(name = "Burger", price = 2, provider = "Talabat"),
        Food(name = "Falafel", price = 4, provider = "Talabat"),
        Food(name = "Shawarma", price = 3, provider = "Talabat"),
        Food(name = "Lentil soup", price = 1, provider = "Talabat"),
        Food(name = "Fish", price = 5, provider = "Talabat"),
    )
}