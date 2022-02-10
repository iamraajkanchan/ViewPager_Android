package com.example.viewpager_android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment()
{
    override fun onCreateView(
        inflater : LayoutInflater , container : ViewGroup? , savedInstanceState : Bundle?
    ) : View?
    {
        return inflater.inflate(R.layout.fragment_first , container , false)
    }

    override fun onStart()
    {
        super.onStart()
        tvFirstFragmentLabel.text = arguments?.getString("Message")
    }
}