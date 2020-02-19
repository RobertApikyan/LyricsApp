package com.irwojhqb.mentorshiptask.music.model

import com.google.gson.annotations.SerializedName


data class QueryParamsItem(

	@field:SerializedName("equals")
	val equals: Boolean? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("value")
	val value: String? = null,

	@field:SerializedName("key")
	val key: String? = null,

	@field:SerializedName("enabled")
	val enabled: Boolean? = null
)