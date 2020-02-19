package com.irwojhqb.mentorshiptask.music.model

import com.google.gson.annotations.SerializedName

data class RequestsItem(

	@field:SerializedName("headerData")
	val headerData: List<HeaderDataItem?>? = null,

	@field:SerializedName("helperAttributes")
	val helperAttributes: Any? = null,

	@field:SerializedName("headers")
	val headers: String? = null,

	@field:SerializedName("data")
	val data: Any? = null,

	@field:SerializedName("method")
	val method: String? = null,

	@field:SerializedName("queryParams")
	val queryParams: List<QueryParamsItem?>? = null,

	@field:SerializedName("auth")
	val auth: Any? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("dataOptions")
	val dataOptions: Any? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("dataMode")
	val dataMode: Any? = null,

	@field:SerializedName("pathVariableData")
	val pathVariableData: List<Any?>? = null,

	@field:SerializedName("folder")
	val folder: Any? = null,

	@field:SerializedName("pathVariables")
	val pathVariables: List<Any?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("currentHelper")
	val currentHelper: Any? = null,

	@field:SerializedName("collectionId")
	val collectionId: String? = null,

	@field:SerializedName("events")
	val events: List<Any?>? = null
)