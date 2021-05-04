package com.example.dagger_first_try

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val wheels: Wheels){
    companion object {
        private const val TAG = "TAG: Car"
    }

    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }

    fun drive() {
        Log.d(TAG, "Drive method")
    }


}