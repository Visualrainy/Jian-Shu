package com.guild.jianshu.di.component

import com.guild.jianshu.di.modules.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

}
