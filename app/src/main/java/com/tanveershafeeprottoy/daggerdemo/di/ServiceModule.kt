package com.tanveershafeeprottoy.daggerdemo.di

import androidx.annotation.NonNull
import com.tanveershafeeprottoy.daggerdemo.DemoService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

// @Module informs Dagger that this class is a Dagger Module
@Module
object ServiceModule {

    @Provides
    @MainScope
    @NonNull
    fun provideDemoService(
        retrofit: Retrofit
    ): DemoService {
        return retrofit.create(DemoService::class.java)
    }
}