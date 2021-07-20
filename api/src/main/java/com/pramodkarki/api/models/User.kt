package com.pramodkarki.api.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/*** You can check this URL for APIs:
        https://github.com/gothinkster/realworld/blob/master/api/README.md
 */
@JsonClass(generateAdapter = true)
data class User(
    @Json(name = "bio")
    val bio: String,
    @Json(name = "email")
    val email: String,
    @Json(name = "image")
    val image: String?,
    @Json(name = "token")
    val token: String,
    @Json(name = "username")
    val username: String
)