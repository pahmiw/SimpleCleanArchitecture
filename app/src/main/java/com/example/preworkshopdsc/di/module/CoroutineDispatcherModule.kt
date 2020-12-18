package com.example.preworkshopdsc.di.module

import com.example.preworkshopdsc.data.dispatcher.CoroutineDispatcherProvider
import com.example.preworkshopdsc.data.dispatcher.DispatcherProvider
import dagger.Binds
import dagger.Module

@Module
interface CoroutineDispatcherModule {
    @Binds
    fun bindDispatcher(dispatcherProvider: CoroutineDispatcherProvider) : DispatcherProvider
}