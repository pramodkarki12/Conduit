package com.pramodkarki.conduit.data

import com.pramodkarki.api.ConduitClient

object ArticlesRepo {

    val api = ConduitClient().api

    suspend fun getGlobalFeed() = api.getArticles()
}