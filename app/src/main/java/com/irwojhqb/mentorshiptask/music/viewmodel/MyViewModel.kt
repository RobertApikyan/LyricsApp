package com.irwojhqb.mentorshiptask.music.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.irwojhqb.mentorshiptask.music.model.Response
import com.irwojhqb.mentorshiptask.music.model.SongsItem
import com.irwojhqb.mentorshiptask.repo.MyRepo
import retrofit2.Call
import retrofit2.Callback


class MyViewModel(application: Application) : AndroidViewModel(application) {
    var modelmutableLiveData: MutableLiveData<MutableList<SongsItem>>

    init {
        // todo move to lazy or just to parameter level
        modelmutableLiveData = MutableLiveData()
    }

    fun getMusicData() {
        MyRepo.getMusic().enqueue(object : Callback<Response> {
            override fun onFailure(call: Call<Response>, t: Throwable) {
                Log.d("MyViewModel__ERROR", t.message!!)
            }

            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
                if (response.isSuccessful) {
                    // todo avoid force unwraps and force casts
                    modelmutableLiveData.value =
                        response.body()!!.response!!.songs as MutableList<SongsItem>?
                    Log.d(
                        "MyViewModel",
                        "Hello-- = ${modelmutableLiveData.value!![0].title}"
                    )
                }
            }
        })
    }

}