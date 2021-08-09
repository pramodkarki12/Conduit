package com.pramodkarki.api.models.requests


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.pramodkarki.api.models.entities.User

@JsonClass(generateAdapter = true)
data class UserUpdateRequest(
    @Json(name = "user")
    val user: User
)