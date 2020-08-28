package com.tanveershafeeprottoy.daggerdemo

import javax.inject.Inject

class AnotherDependency @Inject constructor() {

    fun hello(): String {
        return "Hello"
    }
}