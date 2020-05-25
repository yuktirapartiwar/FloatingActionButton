package com.example.floatingactionbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_f_a_b_animation1.*

class FABAnimation1 : AppCompatActivity() {

    var isOpen = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f_a_b_animation1)

        val fabOpen = AnimationUtils.loadAnimation(this, R.anim.fab_open)
        val fabClose = AnimationUtils.loadAnimation(this,R.anim.fab_close)

        share_btn.setOnClickListener{

            if(isOpen){

                mail_btn.startAnimation(fabClose)
                facebook_btn.startAnimation(fabClose)
                whatsapp_btn.startAnimation(fabClose)
                twitter_btn.startAnimation(fabClose)

                isOpen = false
            }

            else{
                mail_btn.startAnimation(fabOpen)
                facebook_btn.startAnimation(fabOpen)
                whatsapp_btn.startAnimation(fabOpen)
                twitter_btn.startAnimation(fabOpen)

                mail_btn.isClickable
                facebook_btn.isClickable
                whatsapp_btn.isClickable
                twitter_btn.isClickable

                isOpen = true
            }

            mail_btn.setOnClickListener {
                Toast.makeText(this, "Clicked on Mail Button",Toast.LENGTH_SHORT).show()
            }

            facebook_btn.setOnClickListener {
                Toast.makeText(this, "Clicked on FaceBook Button",Toast.LENGTH_SHORT).show()
            }

            whatsapp_btn.setOnClickListener {
                Toast.makeText(this, "Clicked on WhatsApp Button",Toast.LENGTH_SHORT).show()
            }

            twitter_btn.setOnClickListener {
                Toast.makeText(this, "Clicked on Twitter Button",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
