package com.example.viewpager_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.ic_4g ,
            R.drawable.ic_airport_shuttle ,
            R.drawable.ic_launcher_background ,
            R.drawable.ic_launcher_foreground
        )
        val adapter = ViewPagerAdapter(images)
        viewpager2.adapter = adapter
    }
}