package com.tanveershafeeprottoy.daggerdemo

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainDependency @Inject constructor(
    private val anotherDependency: AnotherDependency
) {

    fun checkDependencies(): String {
        GlobalScope.launch {
            DemoRepo.get()
        }
        return anotherDependency.hello()
    }
}