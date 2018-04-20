package com.guild.jianshu.features.view

import android.annotation.SuppressLint
import android.support.design.internal.BottomNavigationItemView
import android.support.design.internal.BottomNavigationMenuView
import android.support.design.widget.BottomNavigationView
import android.util.Log
import androidx.core.view.forEach

@SuppressLint("RestrictedApi")
inline fun BottomNavigationView.disableShiftMode() {
    val menuView: BottomNavigationMenuView = this.getChildAt(0) as BottomNavigationMenuView

    try {
        val shiftMode = menuView.javaClass.getDeclaredField("mShiftingMode")
        shiftMode.isAccessible = true
        shiftMode.setBoolean(menuView, false)
        shiftMode.isAccessible = false

        menuView.forEach {
            val item = it as BottomNavigationItemView
            item.setShiftingMode(false)
            item.setChecked(item.itemData.isChecked)
        }
    } catch (e: Exception) {
        Log.e("JianShu", "access bottomNavigationView failed")
    }
}