package com.tanveershafeeprottoy.daggerdemo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    // injected fields cannot be private have to be at least package-private
    @Inject lateinit var mainDependency: MainDependency

    // @Inject lateinit var mainDependency: MainDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        // Make Dagger instantiate @Inject fields in LoginActivity
        (applicationContext as DaggerDemoApplication).applicationComponent.inject(this)
        // mainDependency is now available
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.mainText).text = mainDependency.checkDependencies()
    }
}