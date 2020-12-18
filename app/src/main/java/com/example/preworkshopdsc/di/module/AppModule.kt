package com.example.preworkshopdsc.di.module

import android.app.Application
import android.content.Context
import com.example.preworkshopdsc.MyApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideContext(app: MyApp): Context = app

    @Provides
    @Singleton
    fun provideApplications(app: MyApp): Application = app
}