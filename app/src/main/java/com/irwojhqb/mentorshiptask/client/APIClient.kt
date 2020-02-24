package com.irwojhqb.mentorshiptask.client

import com.irwojhqb.mentorshiptask.constants.AppConstants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class APIClient {

    companion object{
    val logging = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }
    val okHttp = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()

        fun get():Retrofit{
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(AppConstants.BASE_URL)
                 .client(okHttp).build()
        }
}
}