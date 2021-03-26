package com.nepplus.myzigbangcopy_20210326

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.myzigbangcopy_20210326.datas.Room
import kotlinx.android.synthetic.main.activity_view_room.*
import kotlinx.android.synthetic.main.room_list_item.*
import kotlinx.android.synthetic.main.room_list_item.priceTxt
import kotlin.math.floor

class ViewRoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room)

        val roomData = intent.getSerializableExtra("Room") as Room






    }
}