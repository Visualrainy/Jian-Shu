package com.plugin.guild.data.user.reporitory

import com.guild.jianshu.features.data.repositry.LocalUserDataSource
import com.guild.jianshu.features.data.repositry.RemoteUserDataSource
import com.plugin.guild.data.api.RetrofitApi
import com.plugin.guild.data.user.entity.LoginRequest
import com.plugin.guild.domain.user.model.User
import com.plugin.guild.domain.user.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val retrofitApi: RetrofitApi,
                                             private val remoteUserDataSource: RemoteUserDataSource,
                                             private val localUserDataSource: LocalUserDataSource) : UserRepository {
    override fun loginUser(userName: String, password: String): String {
        retrofitApi.loginUser(LoginRequest(userName, password))
        return "success"
    }

    override fun userDetails(): User {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return User("test", "male")
    }
}