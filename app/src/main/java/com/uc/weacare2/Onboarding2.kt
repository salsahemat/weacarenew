package com.uc.weacare2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_onboarding2.*

class Onboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)


        start_btn.setOnClickListener{
            val myIntent = Intent(this, Register::class.java).apply {
            }
            startActivity(myIntent)
        }


    }
}