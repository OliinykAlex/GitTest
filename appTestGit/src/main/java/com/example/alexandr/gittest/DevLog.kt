package com.example.alexandr.gittest

import android.graphics.Color
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.TextView

object DevLog {

    val activity = null

    private val logTextView = TextView(activity).apply {
        textColor = Color.rgb(0, 250, 0)
        backgroundColor = Color.argb(130, 0 , 0, 0)
        setPadding(15, 0, 15, 0)
    }

    init {
        val decorView = activity.window.decorView
        (decorView as FrameLayout).addView(logTextView)
        var lp = (logTextView.layoutParams as FrameLayout.LayoutParams)
        lp.width = FrameLayout.LayoutParams.WRAP_CONTENT
        lp.height = FrameLayout.LayoutParams.WRAP_CONTENT
        lp.gravity = Gravity.BOTTOM
    }

    fun logToScreen(text: String){
        try {
            logTextView.append(text + "\n")
        } catch (e: Exception){
            println("DevLog error: $e")
        }
    }

}



