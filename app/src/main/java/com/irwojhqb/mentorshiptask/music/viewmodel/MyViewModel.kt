package com.irwojhqb.mentorshiptask.music.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.irwojhqb.mentorshiptask.music.model.SongsItem
import com.irwojhqb.mentorshiptask.repo.MyRepo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MyViewModel(application: Application): AndroidViewModel(application) {
    var modelmutableLiveData:MutableLiveData<MutableList<SongsItem>>
    init {
        modelmutableLiveData = MutableLiveData()
    }
    fun getMusicData(/*searchET:String*/){
        MyRepo.getMusic(/*searchET*/).enqueue(object :Callback<com.irwojhqb.mentorshiptask.music.model.Response>{
            override fun onFailure(call: Call<com.irwojhqb.mentorshiptask.music.model.Response>, t: Throwable) {
                Log.d("MyViewModel_Error" , t.message)
            }

            override fun onResponse(
                call: Call<com.irwojhqb.mentorshiptask.music.model.Response>,
                response: Response<com.irwojhqb.mentorshiptask.music.model.Response>
            )
            {
                if (response.isSuccessful){
                    modelmutableLiveData.value = response.body()!!.response!!.songs as MutableList<SongsItem>?
                    Log.d("MyViewModel_Tag", "aaa = ${modelmutableLiveData.value!![0].title}")
                    //modelmutableLiveData.value = response.body()[0].
                    //Log.d("MyViewModel_Tag", response.body()!![0].fullTitle.toString())
                }
            }

        })
    }

}