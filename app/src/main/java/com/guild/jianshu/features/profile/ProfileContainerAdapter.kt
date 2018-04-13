package com.guild.jianshu.features.profile

import android.content.Context
import com.guild.jianshu.features.profile.view.ProfileContainerView
import com.guild.jianshu.features.profile.view.ProfileItemView

class ProfileContainerAdapter(var items: ArrayList<ProfileItem>) {

    fun getCount(): Int {
        return items.size
    }

    fun getItem(index: Int): ProfileItem {
        return items[index]
    }

    fun bindView(profileContainerView: ProfileContainerView, position: Int) {
        val profileItemView = ViewHolder(profileContainerView.context, getItem(position)).updateItemView()
        profileContainerView.addView(profileItemView)
    }

    class ViewHolder(var context: Context, var item: ProfileItem) {
        fun updateItemView(): ProfileItemView {
            return ProfileItemView(context).apply {
                setItemName(item.itemName)
                setItemIcon(item.itemIconRes)
            }
        }
    }
}