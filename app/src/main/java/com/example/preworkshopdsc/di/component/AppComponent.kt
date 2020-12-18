package com.example.preworkshopdsc.di.component

import com.example.preworkshopdsc.MyApp
import com.example.preworkshopdsc.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AppModule::class,
        NetworkModule::class,
        RepositoryModule::class,
        AndroidInjectionModule::class,
        ActivityBuilder::class,
//        FragmentModule::class,
        ViewModelModule::class,
        ApiServiceModule::class,
        CoroutineDispatcherModule::class]
)

interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: MyApp): Builder

        fun build(): AppComponent
    }

    fun inject(app: MyApp)
}
