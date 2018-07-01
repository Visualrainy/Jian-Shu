package com.guild.jianshu.di.modules

import com.plugin.guild.data.user.reporitory.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UserModule {

//    @Provides
//    @Singleton
//    fun provideUserPresenter(userCase: LoginUserCase): UserPresenter {
//        return UserPresenter(userRepositoryImpl)
//    }

    @Provides
    @Singleton
    fun provideUserRepositoryImpl(userRepositoryImpl: UserRepositoryImpl): UserRepositoryImpl {
        return userRepositoryImpl
    }
}