package com.irwojhqb.mentorshiptask.music.model

import com.google.gson.annotations.SerializedName


data class HeaderDataItem(

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("value")
	val value: String? = null,

	@field:SerializedName("key")
	val key: String? = null,

	@field:SerializedName("enabled")
	val enabled: Boolean? = null
)