package com.example.preworkshopdsc.di.module

import com.example.preworkshopdsc.data.repository.MovieRepositoryImpl
import com.example.preworkshopdsc.domain.repository.MovieRepository
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {
    @Binds
    fun bindMovieRepository(repository: MovieRepositoryImpl): MovieRepository
}