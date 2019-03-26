package com.bugenmode.abakycharov.testproject

import android.app.Application
import com.bugenmode.abakycharov.testproject.di.component.AppComponent
import com.bugenmode.abakycharov.testproject.di.component.DaggerAppComponent
import com.bugenmode.abakycharov.testproject.di.module.ApiModule
import com.bugenmode.abakycharov.testproject.di.module.ContextModule
import com.bugenmode.abakycharov.testproject.di.module.PicassoModule

class App : Application() {
    val appComponent : AppComponent by lazy {
        DaggerAppComponent.builder()
            .apiModule(ApiModule("https://picsum.photos/200/300"))
            .contextModule(ContextModule(this))
            .picassoModule(PicassoModule())
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }

}