package com.example.customloading


import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.github.ybq.android.spinkit.sprite.Sprite
import com.github.ybq.android.spinkit.style.Pulse
import com.github.ybq.android.spinkit.style.ThreeBounce
import com.github.ybq.android.spinkit.style.Wave


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val progressBar = findViewById<View>(R.id.spin_kit) as ProgressBar
        val doubleBounce: Sprite = ThreeBounce()
        progressBar.indeterminateDrawable = doubleBounce
    }
}