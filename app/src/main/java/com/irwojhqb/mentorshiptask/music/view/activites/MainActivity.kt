package com.irwojhqb.mentorshiptask.music.view.activites

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.irwojhqb.mentorshiptask.R
import com.irwojhqb.mentorshiptask.music.model.RequestsItem
import com.irwojhqb.mentorshiptask.music.view.adapters.RecyclerAdapter
import com.irwojhqb.mentorshiptask.music.viewmodel.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   lateinit var  myViewModel:MyViewModel
    var musicArray = emptyList<RequestsItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myViewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)
        myViewModel.getMusicData()
        myViewModel.modelmutableLiveData.observe(this, Observer{
            Log.d("MYVIEVModel---",it[0].name)
            ( myrecycler.adapter as RecyclerAdapter).setItems(it)

        })



        myrecycler.layoutManager = LinearLayoutManager(this)
        myrecycler.adapter = RecyclerAdapter(musicArray).apply {
            itemClick = {
//                val intentItem = Intent(this@MainActivity,SongActivity::class.java)
//                intentItem.putExtra("item", musicArray[it])
//                startActivity(intentItem)
            }
        }
    }
}
