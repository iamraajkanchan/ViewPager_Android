package com.example.viewpager_android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view_layout.view.*

class ViewPagerAdapter(private val images : List<Int>) :
    RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder>()
{
    inner class ViewPagerHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent : ViewGroup , viewType : Int) : ViewPagerHolder
    {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_view_layout , parent , false)
        return ViewPagerHolder(view)
    }

    override fun onBindViewHolder(holder : ViewPagerHolder , position : Int)
    {
        val currentImage = images[position]
        holder.itemView.imgImageContainer.setImageResource(currentImage)
    }

    override fun getItemCount() : Int
    {
        return images.size
    }
}