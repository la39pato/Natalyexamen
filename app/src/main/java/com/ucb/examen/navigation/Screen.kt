package com.ucb.examen.navigation

sealed class Screen(
    val route: String,
) {
    object BooksScreen : Screen("book")

}
