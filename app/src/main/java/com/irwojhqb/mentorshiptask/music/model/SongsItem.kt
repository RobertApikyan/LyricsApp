package com.irwojhqb.mentorshiptask.music.model

import com.google.gson.annotations.SerializedName

data class SongsItem(

    @field:SerializedName("lyrics_owner_id")
    val lyricsOwnerId: Int? = null,

    @field:SerializedName("annotation_count")
    val annotationCount: Int? = null,

    @field:SerializedName("song_art_image_url")
    val songArtImageUrl: String? = null,

    @field:SerializedName("primary_artist")
    val primaryArtist: PrimaryArtist? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("api_path")
    val apiPath: String? = null,

    @field:SerializedName("url")
    val url: String? = null,

    @field:SerializedName("path")
    val path: String? = null,

    @field:SerializedName("song_art_image_thumbnail_url")
    val songArtImageThumbnailUrl: String? = null,

    @field:SerializedName("full_title")
    val fullTitle: String? = null,

    @field:SerializedName("stats")
    val stats: Stats? = null,

    @field:SerializedName("title_with_featured")
    val titleWithFeatured: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("header_image_thumbnail_url")
    val headerImageThumbnailUrl: String? = null,

    @field:SerializedName("pyongs_count")
    val pyongsCount: Any? = null,

    @field:SerializedName("header_image_url")
    val headerImageUrl: String? = null,

    @field:SerializedName("lyrics_state")
    val lyricsState: String? = null
)