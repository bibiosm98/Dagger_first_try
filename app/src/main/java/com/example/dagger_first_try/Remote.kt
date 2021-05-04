package com.example.dagger_first_try

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor(){

    private val TAG = "TAG: Remote"

    fun setListener(car: Car){
        Log.d(TAG, "Remote setListener method")
    }
}