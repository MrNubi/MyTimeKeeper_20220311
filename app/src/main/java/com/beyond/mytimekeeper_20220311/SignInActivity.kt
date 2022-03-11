package com.beyond.mytimekeeper_20220311

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.beyond.mytimekeeper_20220311.databinding.ActivitySignInBinding

class SignInActivity : BaseActivity() {

    lateinit var binding: ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.activity_sign_in)

        setUpValues()
        setupEvents()

    }

    override fun setUpValues() {
        TODO("Not yet implemented")
    }

    override fun setupEvents() {
        TODO("Not yet implemented")
    }
}