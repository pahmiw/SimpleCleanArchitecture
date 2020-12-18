package com.example.preworkshopdsc.di.module

import com.example.preworkshopdsc.data.service.MovieService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class ApiServiceModule {

    @Provides
    @Singleton
    fun providesMovieService(retrofit: Retrofit) = retrofit.create(MovieService::class.java)
}