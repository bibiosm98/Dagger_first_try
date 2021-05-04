package com.example.dagger_first_try

import android.util.Log
import javax.inject.Inject

class Tires @Inject constructor(){
    private val TAG = "TAG: Tires"

    fun inflate(){
        Log.d(TAG, "Tires inflate method")
    }
}