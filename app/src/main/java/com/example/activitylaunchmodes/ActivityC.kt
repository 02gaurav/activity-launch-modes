package com.example.activitylaunchmodes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
    }
    private fun setListener() {

        fun launchActivity() {
            val intent: Intent =  when {
                activity_a.isChecked -> {
                    Intent(this, ActivityA::class.java)
                }

                activity_b.isChecked -> {
                    Intent(this, ActivityB::class.java)
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