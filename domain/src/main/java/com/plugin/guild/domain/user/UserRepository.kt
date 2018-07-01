package com.plugin.guild.domain.user.repository

import com.plugin.guild.domain.user.model.User

interface UserRepository {
    fun userDetails(): User
    fun loginUser(userName: String, password: String): String
}