package com.example.dagger_first_try

import dagger.Component

@Component (modules = [WheelsModule::class])
interface CarComponent {
//    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}
