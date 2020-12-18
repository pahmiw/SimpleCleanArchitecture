package com.example.preworkshopdsc.data.mapper

import com.example.preworkshopdsc.abstraction.Mapper
import com.example.preworkshopdsc.data.response.NowPlayingDto
import com.example.preworkshopdsc.domain.entity.NowPlaying
import javax.inject.Inject

class MovieMapper @Inject constructor() : Mapper<NowPlayingDto, List<NowPlaying>>() {
    override fun map(input: NowPlayingDto): List<NowPlaying> {
        return input.results?.map {
            NowPlaying(
                it.id ?: 0,
                it.overview ?: "",
                it.posterPath ?: "",
                it.title ?: ""
            )
        } ?: emptyList()
    }
}