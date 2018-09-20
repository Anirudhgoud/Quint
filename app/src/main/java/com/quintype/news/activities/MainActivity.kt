package com.quintype.news.activities

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.quintype.news.R
import com.quintype.news.adapters.NewsFeedAdapter
import com.quintype.news.viewmodels.NewsFeedViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mAdapter: NewsFeedAdapter? = null
    private var mNewsFeedViewModel: NewsFeedViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUi()
        initViewModel()
    }

    private fun initViewModel() {
        mNewsFeedViewModel = ViewModelProviders.of(this).get(NewsFeedViewModel::class.java)
        mNewsFeedViewModel?.getFeeds()
    }

    private fun initUi() {

        rvFeedList.layoutManager = LinearLayoutManager(this)
        mAdapter = NewsFeedAdapter()
        rvFeedList.adapter = mAdapter
    }
}
