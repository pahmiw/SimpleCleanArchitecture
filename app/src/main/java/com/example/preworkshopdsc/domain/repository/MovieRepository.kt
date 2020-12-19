package com.example.preworkshopdsc.domain.repository

import com.example.preworkshopdsc.data.vo.Result
import com.example.preworkshopdsc.domain.entity.NowPlaying
import com.example.preworkshopdsc.domain.entity.TvOnTheAir

interface MovieRepository {
    suspend fun getMovieNowPlaying(): Result<List<NowPlaying>>
    suspend fun getTvOnTheAir(): Result<List<TvOnTheAir>>
}