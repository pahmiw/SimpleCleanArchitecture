package com.example.preworkshopdsc.domain.repository

import com.example.preworkshopdsc.data.vo.Result
import com.example.preworkshopdsc.domain.entity.NowPlaying

interface MovieRepository {
    suspend fun getMovieNowPlaying(): Result<List<NowPlaying>>
}