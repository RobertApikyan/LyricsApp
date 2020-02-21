package com.irwojhqb.mentorshiptask.music.model

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("meta")
	val meta: Meta? = null,

	@field:SerializedName("response")
	val response: Response? = null,

	@field:SerializedName("next_page")
	val nextPage: Int? = null,

	@field:SerializedName("songs")
	val songs: List<SongsItem?>? = null
)