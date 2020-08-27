package com.tanveershafeeprottoy.daggerdemo

import android.app.Application

class DaggerDemoApplication : Application() {

    val applicationComponent = DaggerApplicationComponent.create()
}