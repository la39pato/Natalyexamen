package com.ucb.examen.navigation
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
//import com.ucb.examen.book.booksUI


@Composable
fun BookNavigation() {
    val navController = rememberNavController()

    /*NavHost(
        navController = navController,
        startDestination = Screen.BooksScreen.route,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
        popEnterTransition = { EnterTransition.None },
        popExitTransition = { ExitTransition.None }

    ) {
        composable(Screen.BooksScreen.route) {
            booksUI()
            }
        }*/
}
