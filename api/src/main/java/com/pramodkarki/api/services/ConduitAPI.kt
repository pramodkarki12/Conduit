package com.pramodkarki.api.services

import com.pramodkarki.api.models.entities.UserCreds
import com.pramodkarki.api.models.requests.SignupRequest
import com.pramodkarki.api.models.responses.ArticlesResponse
import com.pramodkarki.api.models.responses.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ConduitAPI {

    @POST("users")
    suspend fun signupUser(
        @Body userCreds: SignupRequest
    ) : Response<UserResponse>

    @GET("articles")
    suspend fun getArticles(
        @Query("author") author: String? = null,
        @Query("favorited") favorited: String? = null,
        @Query("tag") tag: String? = null,
    ): Response<ArticlesResponse>
}