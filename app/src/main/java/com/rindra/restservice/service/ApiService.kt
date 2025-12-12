package com.rindra.restservice.service

import com.rindra.restservice.schema.LoginBody
import com.rindra.restservice.schema.PairToken
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("auth/login")
    suspend fun getPairTokens(@Body body: LoginBody): PairToken
}