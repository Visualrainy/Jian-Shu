package com.guild.jianshu.features.profile.view

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.view.LayoutInflater
import com.guild.jianshu.R
import kotlinx.android.synthetic.main.profile_item_view.view.*

class ProfileItemView : ConstraintLayout {

    init {
        LayoutInflater.from(context).inflate(R.layout.profile_item_view, this)
    }

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    fun setItemName(itemName: String) {
        profile_item_name.text = itemName
    }

    fun setItemIcon(iconResId: Int) {
        profile_item_view.setImageResource(iconResId)
    }
}