package com.guild.jianshu.features.profile.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel

class UserProfileViewModel(val id: String): ViewModel() {
    val user: LiveData<User>? = null
}