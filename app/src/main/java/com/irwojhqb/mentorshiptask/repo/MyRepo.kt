package com.irwojhqb.mentorshiptask.repo

import com.irwojhqb.mentorshiptask.client.APIClient
import com.irwojhqb.mentorshiptask.client.MusicAPI
import com.irwojhqb.mentorshiptask.music.model.Response
import retrofit2.Call

object MyRepo {
  val apicClient = APIClient()
    fun getMusic( /*searchED:String*/):Call<Response> = APIClient.get().create(MusicAPI::class.java).getData(/*searchED*/)


}