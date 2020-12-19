package com.example.preworkshopdsc.data.service

import com.example.preworkshopdsc.BuildConfig
import com.example.preworkshopdsc.data.response.NowPlayingDto
import com.example.preworkshopdsc.data.response.TvOnTheAirDto
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {
    @GET("movie/now_playing")
    suspend fun getMovieNowPlaying(@Query("api_key") apiKey: String = BuildConfig.API_KEY): NowPlayingDto

    @GET("tv/on_the_air")
    suspend fun getTvOnTheAir(@Query("api_key") apiKey: String = BuildConfig.API_KEY): TvOnTheAirDto
}