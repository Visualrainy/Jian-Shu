package com.guild.jianshu.di.component

import com.guild.jianshu.di.modules.UserModule
import com.guild.jianshu.features.profile.ProfileFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UserModule::class])
interface UserComponet {
//    fun inject(profileFragment: ProfileFragment)
}
