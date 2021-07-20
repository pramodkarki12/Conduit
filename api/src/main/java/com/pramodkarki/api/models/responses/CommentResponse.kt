package com.pramodkarki.api.models.responses


import com.pramodkarki.api.models.entities.Comment
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CommentResponse(
    @Json(name = "comments")
    val comment: Comment
)