package com.example.librarysample

import android.util.Log

class Logger {

companion object{
    fun showLog(msg:String) {
        Log.e("Logger: ",msg)
    }
}

}