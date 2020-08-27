package com.tanveershafeeprottoy.daggerdemo

import dagger.Component
import javax.inject.Singleton

@Component(modules = [NetworkModule::class])
@Singleton
interface ApplicationComponent {

    // This tells Dagger that MainActivity requests injection so the graph needs to
    // satisfy all the dependencies of the fields that MainActivity is requesting.
    fun inject(activity: MainActivity)
}