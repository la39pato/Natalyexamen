package com.ucb.usecases

import com.ucb.data.BookRepository
import com.ucb.data.NetworkResult
import com.ucb.domain.Book


class GetFavoriteBooks(
    val bookRepository: BookRepository,
    val autor: String
) {
    suspend fun invoke(): NetworkResult<List<Book>> {
        return bookRepository.getFavoriteBooks(autor = this.autor)
    }
}