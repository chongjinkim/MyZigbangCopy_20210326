package com.nepplus.myzigbangcopy_20210326

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        별개의 동작을 만들어 주는 Handler를 만든다 , 안드로이드가 주는 걸로 자동 완성
        //        메인화면으로 이동 => 종료 처리 : 이 행동을 3초 후에 실행

        val myHandler = Handler(Looper.getMainLooper())

        myHandler.postDelayed({
            val myIntent = Intent(this, MainActivity::class.java)

            startActivity(myIntent)

            finish()

        }, 3000)


    }
}