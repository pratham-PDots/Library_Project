package com.example.mylibrary

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

class LibHelper {
    fun start(activity: AppCompatActivity) {
        val intent = Intent(activity, MainActivity::class.java)
        activity.startActivity(intent)
    }
}
