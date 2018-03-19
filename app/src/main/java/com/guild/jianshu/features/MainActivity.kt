package com.guild.jianshu.features

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.guild.jianshu.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val LOG_TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initNavigationView()
    }

    private fun initNavigationView() {
        bottom_navigation.setOnNavigationItemSelectedListener({item ->
            when(item.itemId) {
                R.id.recent -> {
                    Log.d(LOG_TAG, "click recent")
                }
                R.id.discovery -> {
                    Log.d(LOG_TAG, "click discovery")
                }
                R.id.publish -> {
                    Log.d(LOG_TAG, "click publish")
                }
                R.id.notification -> {
                    Log.d(LOG_TAG, "click notification")
                }
                R.id.profile -> {
                    Log.d(LOG_TAG, "click profile")
                }
            }
            true
        })
    }
}
