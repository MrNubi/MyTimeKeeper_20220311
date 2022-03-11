package com.beyond.mytimekeeper_20220311

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.os.HandlerCompat.postDelayed

class SplashActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        setUpValues()
        setupEvents()

    }

    override fun setUpValues() {
        TODO("Not yet implemented")
    }

    override fun setupEvents() {
        val mHandler = Handler(Looper.getMainLooper())

        mHandler.postDelayed({

            val intent = Intent(mContext, SignInActivity::class.java)

            startActivity(intent)

        },2500)
    }
}