package com.example.preworkshopdsc.di.module

import com.example.preworkshopdsc.presentation.home.HomeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector
    abstract fun contributesHomeActivity(): HomeActivity
}