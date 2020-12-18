package com.example.preworkshopdsc.data.service

import com.example.preworkshopdsc.BuildConfig
import com.example.preworkshopdsc.data.response.NowPlayingDto
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {
    @GET("movie/now_playing")
    suspend fun getMovieNowPlaying(@Query("api_key") apiKey: String = BuildConfig.API_KEY): NowPlayingDto
}