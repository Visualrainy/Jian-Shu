package com.plugin.guild.data.user.reporitory

import com.guild.jianshu.data.api.Api
import com.guild.jianshu.presenter.data.repositry.MemoryUserDataStore
import com.guild.jianshu.presenter.data.repositry.RemoteUserDataStore

class UserRepositoryImpl(val api: Api): UserRepository {
    private val remoteUserRepo: UserDataStore
    private val memoryUserCache: UserDataStore

    init {
        remoteUserRepo = RemoteUserDataStore()
        memoryUserCache = MemoryUserDataStore()
    }
    override fun getUserDetails() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }

    override fun login() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}