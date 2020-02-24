package com.irwojhqb.mentorshiptask.client

import com.irwojhqb.mentorshiptask.constants.AppConstants
import com.irwojhqb.mentorshiptask.music.model.Response
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface MusicAPI {
    @Headers("x-rapidapi-key: 4c4145a3camsh405049315441042p16aaf1jsna22bea2b7b70")
      @GET(AppConstants.END_POINT)
    fun getData():Call<Response>
//    @GET("search")
//    fun getSearchData(@Query("q") name:String ):Call<SearchResponse>


}