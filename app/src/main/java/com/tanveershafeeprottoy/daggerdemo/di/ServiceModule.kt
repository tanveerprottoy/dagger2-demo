package com.tanveershafeeprottoy.daggerdemo.di

import androidx.annotation.NonNull
import com.tanveershafeeprottoy.daggerdemo.DemoService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

// @Module informs Dagger that this class is a Dagger Module
@Module
object ServiceModule {

    @Provides
    @Singleton
    @NonNull
    fun provideDemoService(
        retrofit: Retrofit
    ): DemoService {
        return retrofit.create(DemoService::class.java)
    }
}