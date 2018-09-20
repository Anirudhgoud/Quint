package com.quintype.news.viewmodels

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.text.TextUtils
import android.util.Log
import com.quintype.news.model.NewsFeed
import com.quintype.news.model.TopStories
import com.quintype.news.network.ApiClient
import com.quintype.news.network.ApiInterface
import com.quintype.news.utils.Constants
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.collections.ArrayList
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.Function
import io.reactivex.observers.DisposableSingleObserver
import android.widget.Toast
import android.widget.TextView
import com.quintype.news.activities.MainActivity


class NewsFeedViewModel(application: Application) : AndroidViewModel(application) {

    private val apiServices = ApiClient.client?.create(ApiInterface::class.java)
    private var mDisposable: CompositeDisposable? = CompositeDisposable()


    /* fun getFeeds() {

         val apiServices = ApiClient.client?.create(ApiInterface::class.java)

         val call = apiServices?.feed


         val ticketsObservable = apiServices?.feed.replay()

         call?.enqueue(object : Callback<NewsFeed> {
             override fun onFailure(call: Call<NewsFeed>?, t: Throwable?) {
                 Log.e("onFailure", t.toString())
             }

             override fun onResponse(call: Call<NewsFeed>?, response: Response<NewsFeed>?) {
                 Log.e("onResponse", response?.body()?.getItems().toString())
                 getTopStories(response.body())
             }
         })
     }*/

    /* fun getTopStories(body: NewsFeed?) {

         var request = ApiClient.client?.create(ApiInterface::class.java)

         val requests = ArrayList<Observable<*>>()


         body?.getItems()?.iterator()?.forEach { i ->
             if (i.getType().toString().equals(Constants.TYPE_COLLECTION)) {
                 requests.add(request?.getTopStories(i.getSlug())!!)
             } else {

             }
         }
     }*/


    override fun onCleared() {
        super.onCleared()
        mDisposable?.dispose()
    }

    fun getFeeds() {
        mDisposable?.add(apiServices?.feed?.subscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())?.subscribeWith(object :
                        DisposableSingleObserver<NewsFeed>() {
                    override fun onSuccess(t: NewsFeed) {
                        Log.e("TAG", t.getName())
                    }

                    override fun onError(e: Throwable) {
                        Log.e("TAG", e.message)
                    }

                })!!)
    }

    private fun getcouponData() {
        apiServices?.feed
                ?.subscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.subscribe()
    }

   /* private fun getStoreCouponData() {

        Observable.just(apiServices).subscribeOn(Schedulers.computation())
                .flatMap({ s ->
                    val couponsObservable = s.feed.subscribeOn(Schedulers.io())

                    val storeInfoObservable = s.getTopStories(s.).subscribeOn(Schedulers.io())

                    Observable.concatArray<StoreCoupons>(couponsObservable, storeInfoObservable)
                }).observeOn(AndroidSchedulers.mainThread()).subscribe(Consumer<Any> { this.handleResults() }, Consumer<Throwable> { this.handleError() })

    }

    private fun handleResults(storeCoupons: StoreCoupons) {

    }
*/
    private fun handleError(t: Throwable) {
        Log.e("Observer", "" + t.toString())
    }
}