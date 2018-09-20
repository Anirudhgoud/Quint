package com.quintype.news.network

import android.content.Context

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

import java.io.File
import java.util.concurrent.TimeUnit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Anirudh on 09/9/2018.
 */

class ApiClient {

    companion object {

        val BASE_URL: String = "https://demo9639618.mockable.io/"
        var retofit: Retrofit? = null

        val client: Retrofit?
            get() {

                if (retofit == null) {
                    retofit = Retrofit.Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .client(OkHttpClient.Builder()
                                    .readTimeout(60, TimeUnit.SECONDS)
                                    .connectTimeout(60, TimeUnit.SECONDS)
                                    .build())
                            .build()
                }
                return retofit
            }
    }
}
