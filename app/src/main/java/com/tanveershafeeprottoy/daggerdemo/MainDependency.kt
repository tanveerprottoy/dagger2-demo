package com.tanveershafeeprottoy.daggerdemo

import javax.inject.Inject

class MainDependency @Inject constructor(
    private val anotherDependency: AnotherDependency
) {

    fun sayHello(): String {
        return "Hello"
    }
}