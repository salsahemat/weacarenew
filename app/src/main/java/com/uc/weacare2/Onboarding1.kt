package com.uc.weacare2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_onboarding1.*


class Onboarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)

        btn_next1.setOnClickListener{
            val myIntent = Intent(this, Onboarding2::class.java).apply {
            }
            startActivity(myIntent)
        }
    }
}