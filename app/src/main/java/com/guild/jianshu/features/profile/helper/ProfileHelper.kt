package com.guild.jianshu.features.profile.helper

import android.content.res.Resources
import com.guild.jianshu.features.profile.ProfileItem

class ProfileHelper {
    companion object {
        fun getProfileContainerItems(resources: Resources, itemNameRes: Int, itemIconRes: Int = -1): List<ProfileItem> {
            val profileItems = arrayListOf<ProfileItem>()
            val itemNames = resources.getStringArray(itemNameRes)
            val itemIcons = resources.obtainTypedArray(itemIconRes)

            itemNames.forEachIndexed({ index: Int, itemName: String ->
                var profileItem = ProfileItem(itemName, itemIcons.getResourceId(index, -1))
                profileItems.add(profileItem)
            })
            itemIcons.recycle()

            return profileItems
        }
    }
}