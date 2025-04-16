package com.ucb.framework.dto.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.ucb.domain.Book

@JsonClass(generateAdapter = true)
class BookResponseDto(
    @Json(name = "results")
    val results: List<Book>
)