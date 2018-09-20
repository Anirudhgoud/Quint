package com.quintype.news.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.quintype.news.R

class NewsFeedAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_feed_list_item, parent,
                false)
        return NewsFeedHolder(view)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
    }


    class NewsFeedHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}