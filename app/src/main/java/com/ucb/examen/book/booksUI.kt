package com.ucb.examen.book

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ucb.domain.Book

@Composable
fun BookScreen(viewModel: BooksViewModel = hiltViewModel()) {
    val books by viewModel.books
    val favorites by viewModel.favorites

    var query by remember { mutableStateOf("") }


    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        TextField(
            value = query,
            onValueChange = { query = it },
            label = { Text("Buscar libro") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        /*Button(onClick = { viewModel.searchBooks(query) }) {
            Text("Buscar")
        }*/

        Spacer(modifier = Modifier.height(16.dp))

        Spacer(modifier = Modifier.height(24.dp))

        Text("Favoritos", style = MaterialTheme.typography.titleMedium)

        /*LazyColumn {
            items(favorites) { book ->
                Text("- ${book.titulo}", style = MaterialTheme.typography.bodyMedium)
            }
        }*/
    }
}

@Composable
fun BookItem(book: Book, onLike: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(text = book.titulo, style = MaterialTheme.typography.titleMedium)
                Text(text = book.autor, style = MaterialTheme.typography.bodySmall)
                Text(text = "Publicado en: ${book.anio}", style = MaterialTheme.typography.bodySmall)
            }
            IconButton(onClick = onLike) {
                Icon(Icons.Default.Favorite, contentDescription = "Me gusta")
            }
        }
    }
}
