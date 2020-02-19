package com.irwojhqb.mentorshiptask.client

import com.irwojhqb.mentorshiptask.constants.AppConstants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class APIClient {
    companion object{
        fun get():Retrofit{
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(AppConstants.BASE_URL)
                .build()
        }
    }
}