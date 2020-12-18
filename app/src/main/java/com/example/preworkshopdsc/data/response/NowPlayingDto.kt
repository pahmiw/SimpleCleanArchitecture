package com.example.preworkshopdsc.data.response

import com.squareup.moshi.Json


data class NowPlayingDto(
    @field:Json(name = "results")
    val results: List<Result>?
) {
    data class Result(
        @field:Json(name = "id")
        val id: Int?,
        @field:Json(name = "overview")
        val overview: String?,
        @field:Json(name = "poster_path")
        val posterPath: String?,
        @field:Json(name = "title")
        val title: String?
    )
}