package com.rindra.restservice.schema

data class LoginBody(
    val email: String,
    val password: String
){}

data class PairToken(
    val token: String,
    val refreshToken: String
){}