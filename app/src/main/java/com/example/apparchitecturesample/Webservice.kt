package com.example.apparchitecturesample

import retrofit2.http.GET
import retrofit2.http.Path

interface Webservice {
    @GET("/users/{user}")
    suspend fun getUser(@Path("user") userId: String): User
}