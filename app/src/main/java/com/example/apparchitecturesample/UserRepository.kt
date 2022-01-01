package com.example.apparchitecturesample

class UserRepository {
    private val webservice: Webservice = TODO()
    suspend fun getUser(userId: String) = webservice.getUser(userId)
}