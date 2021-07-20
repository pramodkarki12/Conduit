package com.pramodkarki.api.services

import com.pramodkarki.api.models.ArticlesResponse
import retrofit2.Call
import retrofit2.http.GET

interface ConduitAPI {
    @GET("articles")
    fun getArticles(): Call<ArticlesResponse>
}