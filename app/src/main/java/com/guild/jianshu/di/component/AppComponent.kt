package com.guild.jianshu.di.component

import com.guild.jianshu.di.moudles.AppMoudle
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppMoudle::class])
interface AppComponent {

}
