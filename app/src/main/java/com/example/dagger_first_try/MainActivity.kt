package com.example.dagger_first_try

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        car = DaggerCarComponent.create().getCar()
        val appComponent = DaggerCarComponent.create()
//        car = appComponent.getCar()
        appComponent.inject(this)

        car.drive()
    }

}