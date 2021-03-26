package com.nepplus.myzigbangcopy_20210326.adpaters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.nepplus.myzigbangcopy_20210326.R
import com.nepplus.myzigbangcopy_20210326.datas.Room

class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {

    val Inflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if(tempRow == null){

            tempRow = Inflater.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

        val roomData = mList[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descTxt = row.findViewById<TextView>(R.id.descTxt)


        descTxt.text = roomData.description
        addressAndFloorTxt.text = "${roomData.address}, ${roomData.getFormatedFloor()}"
        priceTxt.text = roomData.getFormatedPrice()


        return row
    }


}