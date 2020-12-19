package com.example.preworkshopdsc.data.mapper

import com.example.preworkshopdsc.abstraction.Mapper
import com.example.preworkshopdsc.data.response.TvOnTheAirDto
import com.example.preworkshopdsc.domain.entity.TvOnTheAir
import javax.inject.Inject

class TvOnTheAirMapper @Inject constructor() : Mapper<TvOnTheAirDto, List<TvOnTheAir>>() {
    override fun map(input: TvOnTheAirDto): List<TvOnTheAir> {
        return input.results?.map {
            TvOnTheAir(
                it.id ?: 0,
                it.name ?: "",
                it.overview ?: "",
                it.posterPath ?: ""
            )
        } ?: emptyList()
    }
}