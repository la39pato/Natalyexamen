package com.ucb.framework.dto.book

import com.ucb.data.NetworkResult
import com.ucb.data.book.IBookRemoteDataSource
import com.ucb.framework.dto.service.RetrofitBuilder

class IBookRemoteDataSource(
    val retrofiService: RetrofitBuilder
): IBookRemoteDataSource {
    override suspend fun getFavoriteBooks(autor: String): NetworkResult<List<Any>> {
        val response = retrofiService.bookService.fetchFavoriteBooks(autor)
        return if (response.isSuccessful) {
            return NetworkResult.Success(response.body()!!.results.map { it.autor })
        } else {
            NetworkResult.Error(response.message())
        }
    }
}