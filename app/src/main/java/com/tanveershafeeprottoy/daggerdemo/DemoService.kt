package com.tanveershafeeprottoy.daggerdemo

interface DemoService {

    suspend fun get(): DemoResponse
}