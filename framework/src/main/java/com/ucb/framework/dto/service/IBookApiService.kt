package com.ucb.framework.dto.service

import com.ucb.framework.dto.dto.BookResponseDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface IBookApiService {
    @GET("/3/discover/book?sort_by=popularity.desc")
    suspend fun fetchFavoriteBooks(@Query("api_key") autor: String): Response<BookResponseDto>
}