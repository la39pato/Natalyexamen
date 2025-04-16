package com.ucb.examen.book

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ucb.domain.Book
import com.ucb.usecases.GetFavoriteBooks
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BooksViewModel @Inject constructor(
    private val getFavoriteBooks: GetFavoriteBooks,
) : ViewModel() {

    /*private val _books = MutableStateFlow<List<Book>>(emptyList())
    val books: StateFlow<List<Book>> = _books.asStateFlow()

    private val _favorites = MutableStateFlow<List<Book>>(emptyList())
    val favorites: StateFlow<List<Book>> = _favorites.asStateFlow()


    fun addToFavorites(book: Book) {
        viewModelScope.launch {
            saveBookUseCase(book)
            loadFavorites()
        }
    }*/
}
