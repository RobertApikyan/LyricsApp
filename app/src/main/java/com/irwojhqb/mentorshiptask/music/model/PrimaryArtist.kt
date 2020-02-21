package com.irwojhqb.mentorshiptask.music.model

import com.google.gson.annotations.SerializedName

data class PrimaryArtist(

	@field:SerializedName("is_meme_verified")
	val isMemeVerified: Boolean? = null,

	@field:SerializedName("image_url")
	val imageUrl: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("iq")
	val iq: Int? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("api_path")
	val apiPath: String? = null,

	@field:SerializedName("is_verified")
	val isVerified: Boolean? = null,

	@field:SerializedName("header_image_url")
	val headerImageUrl: String? = null,

	@field:SerializedName("url")
	val url: String? = null
)