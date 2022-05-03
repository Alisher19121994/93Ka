package com.best.a93k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        open()
    }

    private fun open() {
        imageView = findViewById(R.id.image_ID)
        val button: Button = findViewById(R.id.button_ID)
        button.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.together)
            imageView.startAnimation(animation)
        }
    }
}