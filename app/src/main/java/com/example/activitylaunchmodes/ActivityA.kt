package com.example.activitylaunchmodes

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }
    var a =0;

    private fun setListener() {

        fun launchActivity() {
            val intent: Intent =  when {
                activity_a.isChecked -> {
                    Intent(this, ActivityA::class.java)
                }

                activity_b.isChecked -> {
                    a += 1
                    if(a==1){
                        Log.e("TEST","here ")
                       val intent =  Intent(this, ActivityB::class.java)
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                        intent
                    } else {
                        Intent(this, ActivityB::class.java)
                    }

                }

                activity_c.isChecked -> {
                    Intent(this, ActivityC::class.java)
                }

                activity_d.isChecked -> {
                    Intent(this, ActivityD::class.java)
                }

                else ->{
                    Intent(this, ActivityA::class.java)
                }
            }

            startActivity(intent)
        }


        bt_standard.setOnClickListener {

        }

        bt_single_instance.setOnClickListener {
            launchActivity()
        }

        bt_single_task.setOnClickListener {

        }

        bt_single_top.setOnClickListener {

        }
    }
}