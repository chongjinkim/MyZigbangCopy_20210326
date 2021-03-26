package com.nepplus.myzigbangcopy_20210326

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.myzigbangcopy_20210326.datas.Room
import kotlinx.android.synthetic.main.activity_view_room.*


class ViewRoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room)

        val roomData = intent.getSerializableExtra("Room") as Room

        priceTxt.text = roomData.getFormattedPrice()

        floorTxt.text = roomData.getFormattedPrice()

        addressTxt.text = roomData.address

        descTxt.text = roomData.description




    }
}