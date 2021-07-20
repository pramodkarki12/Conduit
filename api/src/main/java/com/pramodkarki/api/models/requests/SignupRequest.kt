package com.pramodkarki.api.models.requests


import com.pramodkarki.api.models.entities.UserCreds
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SignupRequest(
    @Json(name = "user")
    val user: UserCreds
)