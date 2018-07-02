package com.guild.jianshu.features

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import com.guild.jianshu.R
import com.guild.jianshu.common.BaseFragment
import com.guild.jianshu.features.discovery.DiscoveryFragment
import com.guild.jianshu.features.message.MessageFragment
import com.guild.jianshu.features.profile.ProfileFragment
import com.guild.jianshu.features.publish.PublishFragment
import com.guild.jianshu.features.recents.RecentFragment
import com.guild.jianshu.view.disableShiftMode
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private const val LOG_TAG = "MainActivity"
    }

    private var mFragments: ArrayList<BaseFragment>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFragment()
        initNavigationView()
        setSupportActionBar(findViewById(R.id.main_toolbar))
    }

    private fun initFragment() {
        mFragments = arrayListOf(RecentFragment.newInstance(), DiscoveryFragment.newInstance(), PublishFragment.newInstance(),
                MessageFragment.newInstance(), ProfileFragment.newInstance())
        supportFragmentManager.beginTransaction().add(R.id.fragment_container, mFragments!![0]).commit();
    }

    private fun initNavigationView() {
        bottom_navigation.disableShiftMode()
        bottom_navigation.itemIconTintList = null
        bottom_navigation.setOnNavigationItemSelectedListener({ item ->
            val transaction = supportFragmentManager.beginTransaction()
            when (item.itemId) {
                R.id.subscription -> {
                    Log.d(LOG_TAG, "click recent")
                    transaction.replace(R.id.fragment_container, mFragments!![0])
                }
                R.id.discovery -> {
                    Log.d(LOG_TAG, "click discovery")
                    transaction.replace(R.id.fragment_container, mFragments!![1])
                }
                R.id.publish -> {
                    Log.d(LOG_TAG, "click publish")
                    transaction.replace(R.id.fragment_container, mFragments!![2])
                }
                R.id.notification -> {
                    Log.d(LOG_TAG, "click notification")
                    transaction.replace(R.id.fragment_container, mFragments!![3])
                }
                R.id.profile -> {
                    Log.d(LOG_TAG, "click profile")
                    transaction.replace(R.id.fragment_container, mFragments!![4])
                    supportActionBar?.title = "我的"
                }
            }
            transaction.commit()
            true
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_bar_items, menu)
        return true
    }
}
