package com.guild.jianshu.features.profile.view

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import com.guild.jianshu.R

class ProfileItemView : ConstraintLayout {

    init {
        initView()
    }

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    private fun initView() {
        LayoutInflater.from(context).inflate(R.layout.profile_item_view, this)
    }
}