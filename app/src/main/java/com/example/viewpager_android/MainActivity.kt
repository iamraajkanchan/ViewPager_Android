package com.example.viewpager_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
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
        viewpager2.apply {
            this.adapter = adapter
            this.orientation = ViewPager2.ORIENTATION_VERTICAL
            this.beginFakeDrag()
            this.fakeDragBy(-10f)
            this.endFakeDrag()
        }
    }
}