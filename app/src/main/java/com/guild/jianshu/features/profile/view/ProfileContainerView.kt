package com.guild.jianshu.features.profile.view

import android.content.Context
import android.widget.LinearLayout
import com.guild.jianshu.features.profile.ProfileContainerAdapter

class ProfileContainerView(context: Context) : LinearLayout(context) {

    private var profileContainerAdapter: ProfileContainerAdapter? = null

    fun setAdapter(adapter: ProfileContainerAdapter) {
        profileContainerAdapter = adapter
        updateView()
    }

    private fun updateView() {
        for (i in 0 until (profileContainerAdapter?.getCount() ?: 0)) {
            profileContainerAdapter?.bindView(this, i)
        }
    }


}