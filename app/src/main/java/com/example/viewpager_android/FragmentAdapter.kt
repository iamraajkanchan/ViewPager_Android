package com.example.viewpager_android

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class FragmentAdapter(private val fragmentManager : FragmentManager) :
    FragmentStatePagerAdapter(fragmentManager)
{
    override fun getCount() : Int = 50

    override fun getItem(position : Int) : Fragment
    {
        val firstFragment = FirstFragment()
        val bundle = Bundle()
        bundle.putString("Message" , "Message from First Fragment $position")
        firstFragment.arguments = bundle
        return firstFragment
    }
}