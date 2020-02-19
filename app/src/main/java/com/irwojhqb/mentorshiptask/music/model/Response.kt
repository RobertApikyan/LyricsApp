package com.irwojhqb.mentorshiptask.music.model

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("protocolProfileBehavior")
	val protocolProfileBehavior: List<Any?>? = null,

	@field:SerializedName("variables")
	val variables: List<Any?>? = null,

	@field:SerializedName("folders_order")
	val foldersOrder: List<Any?>? = null,

	@field:SerializedName("folders")
	val folders: List<Any?>? = null,

	@field:SerializedName("auth")
	val auth: Any? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("requests")
	val requests: List<RequestsItem>,

	@field:SerializedName("events")
	val events: Any? = null,

	@field:SerializedName("order")
	val order: List<String?>? = null
)