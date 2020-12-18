package com.example.preworkshopdsc.data.source

import com.example.preworkshopdsc.data.response.NowPlayingDto
import com.example.preworkshopdsc.data.service.MovieService
import com.example.preworkshopdsc.data.vo.Result
import kotlinx.coroutines.CoroutineDispatcher
import javax.inject.Inject

class MovieRemoteDataSource @Inject constructor(private val movieService: MovieService) :
    RemoteDataSource() {

    suspend fun getMovieNowPlaying(dispatcherProvider: CoroutineDispatcher): Result<NowPlayingDto> {
        return safeApiCall(dispatcherProvider) { movieService.getMovieNowPlaying() }
    }
}