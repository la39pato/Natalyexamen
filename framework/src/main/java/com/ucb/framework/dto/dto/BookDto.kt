package com.ucb.framework.dto.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookDto(
    val autor: String,
    val year_publication: String,
    @Json(name = "autor")
    val titulo:String
)