package com.nepplus.myzigbangcopy_20210326.datas

import java.text.NumberFormat
import java.util.*

class Room(
    val price : Int,
    val address : String,
    val floor : Int,
    val description : String) {

    fun getFormatedPrice() : String{

        if(price < 10000){
            val priceStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
            return priceStr
        }

        else{
            //코딩은 정수만 나온다 // 85000/10000 - 8     85000%10000 - 5000
            val uk = this.price / 10000

            val rest = this.price % 10000

            val priceStr = "${uk}억${NumberFormat.getNumberInstance(Locale.KOREA).format(rest)}"

            return priceStr
        }
    }

    fun getFormatedFloor() : String{

        if(this.floor >= 1){
            return "${this.floor}층"
        }

        else if(this.floor == 0){
            return "반지하"
        }

        else{
            return "${-this.floor}층"
        }


    }
}