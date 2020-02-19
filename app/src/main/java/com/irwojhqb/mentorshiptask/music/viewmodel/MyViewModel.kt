package com.irwojhqb.mentorshiptask.music.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.irwojhqb.mentorshiptask.music.model.RequestsItem
import com.irwojhqb.mentorshiptask.music.model.Response
import com.irwojhqb.mentorshiptask.repo.MyRepo
import retrofit2.Call
import retrofit2.Callback


class MyViewModel(application: Application): AndroidViewModel(application) {
    var modelmutableLiveData:MutableLiveData<List<RequestsItem>>
    init {
        modelmutableLiveData = MutableLiveData()
    }
    fun getMusicData(){
        MyRepo.getMusic().enqueue(object :Callback<Response>{
            override fun onFailure(call: Call<Response>, t: Throwable) {

            }


            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
                if (response.isSuccessful){


                    modelmutableLiveData.value = response.body()!!.requests
                }

            }

        })
    }

}