package com.quintype.news.network;

import com.quintype.news.model.NewsFeed;
import com.quintype.news.model.TopStories;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;


/**
 * Created by Anirudh on 09/9/2018.
 */

public interface ApiInterface {

    @GET("collection")
    Single<NewsFeed> getFeed();

    @GET()
    Single<TopStories> getTopStories(@Url String url);
}
