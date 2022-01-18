package com.example.viewpager_android

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter

class CustomPagerAdapter(private val context : Context) : PagerAdapter()
{
    override fun getCount() : Int
    {
        return ModelObject.values().size
    }

    override fun isViewFromObject(view : View , `object` : Any) : Boolean
    {
        return view == `object`
    }

    override fun instantiateItem(container : ViewGroup , position : Int) : Any
    {
        val modelObject : ModelObject = ModelObject.values()[position]
        val layoutInflater : LayoutInflater = LayoutInflater.from(context)
        val layout = layoutInflater.inflate(modelObject.layoutId , container , false)
        container.addView(layout)
        return layout
    }

    override fun destroyItem(container : ViewGroup , position : Int , `object` : Any)
    {
        container.removeView(`object` as View)
    }

}