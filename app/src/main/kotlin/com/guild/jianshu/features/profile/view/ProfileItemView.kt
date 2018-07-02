package com.guild.jianshu.features.profile.view

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import com.guild.jianshu.R
import kotlinx.android.synthetic.main.profile_item_view.view.*

class ProfileItemView : ConstraintLayout {

    init {
        initView()
    }

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    private fun initView() {
        val params = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT)
        params.topMargin = resources.getDimensionPixelSize(R.dimen.margin_small)
        params.bottomMargin = params.topMargin
        layoutParams = params

        LayoutInflater.from(context).inflate(R.layout.profile_item_view, this)
    }

    fun setItemName(itemName: String) {
        profile_item_name.text = itemName
    }

    fun setItemIcon(iconResId: Int) {
        profile_item_view.setImageResource(iconResId)
    }
}