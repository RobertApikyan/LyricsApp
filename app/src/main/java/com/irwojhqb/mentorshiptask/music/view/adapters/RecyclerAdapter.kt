package com.irwojhqb.mentorshiptask.music.view.adapters

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.irwojhqb.mentorshiptask.R
import com.irwojhqb.mentorshiptask.music.model.SongsItem
import com.squareup.picasso.Picasso

// todo move musicList to
class RecyclerAdapter (private var musicList: MutableList<SongsItem>):
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    var itemClick: (position: Int) -> Unit = { }
   // private var musicList: MutableList<SongsItem> = mutableListOf()
    //private var musicSearchList: MutableList<HitsItem> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        // todo name layout names more descriptive
      val inflate =LayoutInflater.from(parent.context).inflate(R.layout.recycler_item,parent,false)
        return ViewHolder(inflate)
    }

    override fun getItemCount(): Int {
       return musicList.size
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
       holder.bind(musicList[position])
      //  notifyDataSetChanged()
    }

    fun setItems(listMusic: MutableList<SongsItem>){
        musicList.clear()
        musicList = listMusic
        notifyDataSetChanged()

    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        var itemClick :(position:Int)->Unit={ }


        var artistImage :ImageView
        var artistName:TextView
        var songName:TextView
        var backImage:ImageView

                init{
                    backImage = itemView.findViewById(R.id.back_image)
                    artistImage = itemView.findViewById(R.id.circleImageView)
                    artistName = itemView.findViewById(R.id.name_Artist)
                    songName = itemView.findViewById(R.id.name_Song)
                }

        fun bind(reqItem:SongsItem){
//            Picasso.get()
//                .load(Uri.parse(reqItem.headerImageThumbnailUrl))
//                .into(artistImage)
//            Picasso.get()
//                .load(Uri.parse(reqItem.songArtImageThumbnailUrl))
//                .into(backImage)
            artistImage.load(Uri.parse(reqItem.headerImageThumbnailUrl))
            backImage.load(Uri.parse(reqItem.songArtImageThumbnailUrl))
            artistName.text =reqItem.primaryArtist!!.name
            songName.text = reqItem.fullTitle
        }
    }
}