package com.ucb.framework.dto.mappers

import com.ucb.domain.Book
import com.ucb.framework.dto.BookDB.BookTable
import com.ucb.framework.dto.dto.BookDto

fun BookDto.toModel(): Book {
    return Book(
        titulo = titulo ?: "Sin título",
        autor = (autor ?: listOf( "Autor desconocido" )).toString(),
        anio = year_publication ?: -1
    )
}

fun BookTable.toModel(): Book {
    return Book(
        titulo = titulo,
        autor = autor.toString(),
        anio = anio
    )
}

fun Book.toEntity(): BookTable {
    return BookTable(
        titulo = titulo,
        autor = autor,
        anio = anio as Int
    )
}