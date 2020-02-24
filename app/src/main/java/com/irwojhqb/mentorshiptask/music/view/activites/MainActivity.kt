package com.irwojhqb.mentorshiptask.music.view.activites

import android.os.Bundle
import android.util.Log
import android.view.inputmethod.EditorInfo
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.irwojhqb.mentorshiptask.R
import com.irwojhqb.mentorshiptask.music.model.SongsItem
import com.irwojhqb.mentorshiptask.music.view.adapters.RecyclerAdapter
import com.irwojhqb.mentorshiptask.music.viewmodel.MyViewModel
import kotlinx.android.synthetic.main.activity_main.*

//
class MainActivity : AppCompatActivity() {
    lateinit var  myViewModel:MyViewModel
    var musicArray:MutableList<SongsItem> = mutableListOf()
    lateinit var search_text:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        reycylerINIT()

        myViewModel = ViewModelProviders.of(this).get(MyViewModel::class.java)
        myViewModel.modelmutableLiveData.observe(this, Observer{
            Log.d("MYVIEVModel---",it[0].primaryArtist!!.name!!)
            ( myrecycler.adapter as RecyclerAdapter).setItems(it) })

        myViewModel.getMusicData()

//        search_et.setOnEditorActionListener { v, actionId, event ->
//            if(actionId== EditorInfo.IME_ACTION_SEARCH){
//                myViewModel.getMusicData(/*search_et.text.toString()*/)
//            }
//            false
//        }

    }


    fun reycylerINIT(){
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
