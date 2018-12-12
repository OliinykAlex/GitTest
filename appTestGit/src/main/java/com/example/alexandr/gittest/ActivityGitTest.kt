package com.example.alexandr.gittest

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ActivityGitTest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_git_test)

        val tv = TextView(this).apply {
            setPadding(0,0,0,0)
        }

        with(tv){
            text = "abc"
        }

        // commit 2

        // branch A commit 1
        // branch A commit 2

    }
}
