package com.example.test

import android.graphics.Point
import android.os.Build
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var dp = 0f

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val displayMetrics = DisplayMetrics()
        this@MainActivity.windowManager.defaultDisplay.getMetrics(displayMetrics)

        val deviceHeight = displayMetrics.heightPixels

        Log.e("tag", "dp "+ dp + " dm "+ deviceHeight)

        transYAni(deviceHeight)
    }
    private fun transYAni(size : Int) {
        btn_transY_up.setOnClickListener {
            imageView.visibility = View.VISIBLE
            imageView.animate().translationY(-size /3f).scaleX(1.2f).scaleY(1.2f).setDuration(3000L).withEndAction {
                imageView.scaleX = 0.2f
                imageView.scaleY = 0.2f
                imageView.translationY = 0f
                imageView.visibility = View.GONE
            }.start()
        }

    }
}