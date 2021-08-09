package com.pramodkarki.api.services

import com.pramodkarki.api.models.entities.UserCreds
import com.pramodkarki.api.models.requests.LoginRequest
import com.pramodkarki.api.models.requests.SignupRequest
import com.pramodkarki.api.models.responses.ArticleResponse
import com.pramodkarki.api.models.responses.ArticlesResponse
import com.pramodkarki.api.models.responses.TagsResponse
import com.pramodkarki.api.models.responses.UserResponse
import retrofit2.Response
import retrofit2.http.*

interface ConduitAPI {

    @POST("users")
    suspend fun signupUser(
        @Body userCreds: SignupRequest
    ) : Response<UserResponse>

    @POST("users")
    suspend fun loginUser(
        @Body userCreds: LoginRequest
    ) : Response<UserResponse>

    @GET("articles")
    suspend fun getArticles(
        @Query("author") author: String? = null,
        @Query("favorited") favorited: String? = null,
        @Query("tag") tag: String? = null,
    ): Response<ArticlesResponse>

    @GET("articles/{slug}")
    suspend fun getArticleBySlug(
        @Path("slug") slug: String
    ): Response<ArticleResponse>

    @GET("tags")
    suspend fun getTags(): Response<TagsResponse>
}