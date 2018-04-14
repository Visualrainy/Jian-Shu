package com.guild.jianshu.features.profile.view

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import com.guild.jianshu.features.profile.ProfileContainerAdapter

class ProfileContainerView : LinearLayout {

    private var profileContainerAdapter: ProfileContainerAdapter? = null

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

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