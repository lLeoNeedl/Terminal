package com.example.terminal.data

import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface ApiService {

    @GET("aggs/ticker/AAPL/range/1/hour/2022-01-09/2023-01-09?adjusted=true&sort=asc&limit=50000&apiKey=MNwGwLiB59jRLoq_6U1WtlREJD_0LRBK")
    suspend fun loadBars(): Result
}