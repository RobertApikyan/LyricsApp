package com.irwojhqb.mentorshiptask.client

import com.irwojhqb.mentorshiptask.constants.AppConstants
import com.irwojhqb.mentorshiptask.music.model.RequestsItem
import com.irwojhqb.mentorshiptask.music.model.Response
import retrofit2.Call
import retrofit2.http.GET

interface MusicAPI {
    @GET(AppConstants.END_POINT)
    fun getData():Call<Response>
}