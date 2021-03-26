package com.nepplus.myzigbangcopy_20210326

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.myzigbangcopy_20210326.adpaters.RoomAdapter
import com.nepplus.myzigbangcopy_20210326.datas.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<Room>()

    lateinit var mAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(Room(2000, "서울시 동대문구", 2, "동대문구 방입니다"))
        mRoomList.add(Room(3000, "서울시 동대문구", 5, "동대문구 방입니다"))
        mRoomList.add(Room(24000, "서울시 동대문구", 0, "동대문구 방입니다"))
        mRoomList.add(Room(15000, "서울시 서대문구", -2, "서대문구 방입니다"))
        mRoomList.add(Room(6000, "서울시 서대문구", 2, "서대문구 방입니다"))
        mRoomList.add(Room(37000, "서울시 서대문구", -3, "서대문구 방입니다"))
        mRoomList.add(Room(8000, "서울시 남대문구", 4, "남대문구 방입니다"))
        mRoomList.add(Room(19000, "서울시 남대문구", 0, "남대문구 방입니다"))
        mRoomList.add(Room(2000, "서울시 남대문구", -2, "남대문구 방입니다"))

        mAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)

        RoomListView.adapter = mAdapter

    }
}