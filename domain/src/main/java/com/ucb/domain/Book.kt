package com.ucb.domain

import kotlinx.serialization.Serializable

@Serializable
data class Book(
    val autor: String,
    val titulo: String,
    val anio: Any
)