package com.bugenmode.abakycharov.testproject.di.component

import com.bugenmode.abakycharov.testproject.App
import com.bugenmode.abakycharov.testproject.di.module.ApiModule
import com.bugenmode.abakycharov.testproject.di.module.ContextModule
import com.bugenmode.abakycharov.testproject.di.module.PicassoModule
import dagger.Component

@Component(modules = [ApiModule::class, ContextModule::class, PicassoModule::class])
interface AppComponent {
    fun inject(app: App)
}