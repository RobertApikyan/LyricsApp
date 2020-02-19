package com.irwojhqb.mentorshiptask.music.view.adapters

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.irwojhqb.mentorshiptask.R
import com.irwojhqb.mentorshiptask.music.model.RequestsItem
import com.squareup.picasso.Picasso

class RecyclerAdapter (private var musicList: List<RequestsItem>):
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    var itemClick: (position: Int) -> Unit = { }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
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

    fun setItems(listMusic: List<RequestsItem>){
        musicList = listMusic
        notifyDataSetChanged()

    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        var itemClick :(position:Int)->Unit={ }


        var artistImage :ImageView
        var artistName:TextView
        var songName:TextView

                init{
                    artistImage = itemView.findViewById(R.id.circleImageView)
                    artistName = itemView.findViewById(R.id.name_Artist)
                    songName = itemView.findViewById(R.id.name_Song)
                }

        fun bind(reqItem:RequestsItem){
            Picasso.get()
                .load(Uri.parse(reqItem.url))
                .into(artistImage)
            artistName.text =reqItem.auth.toString()
            songName.text = reqItem.name
        }
    }
}