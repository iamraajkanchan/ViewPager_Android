package com.example.viewpager_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    private lateinit var fragmentAdapter : FragmentAdapter
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentAdapter = FragmentAdapter(supportFragmentManager)
        viewpager.adapter = fragmentAdapter
    }
}