package com.tanveershafeeprottoy.daggerdemo

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
object DemoRepo {
    @set:Inject
    lateinit var demoService: DemoService

/*    @set:Inject
    lateinit var demoService: dagger.Lazy<DemoService>*/

    suspend fun get(): DemoResponse {
        return demoService.get()
    }
}