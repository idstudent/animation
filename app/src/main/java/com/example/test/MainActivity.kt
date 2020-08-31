package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var anim : Animation = AnimationUtils.loadAnimation(this, R.anim.anim_translate1)
        imageView.startAnimation(anim)
        anim.setAnimationListener(testListener)

    }
    val testListener = object : Animation.AnimationListener{
        override fun onAnimationRepeat(p0: Animation?) {
        }

        override fun onAnimationEnd(p0: Animation?) {
            imageView.visibility = View.GONE
        }

        override fun onAnimationStart(p0: Animation?) {
        }

    }
}