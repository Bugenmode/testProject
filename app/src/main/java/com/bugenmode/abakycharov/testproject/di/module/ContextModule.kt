package com.bugenmode.abakycharov.testproject.di.module

import android.content.Context
import dagger.Provides
import javax.inject.Singleton

class ContextModule(val context: Context) {

    @Provides
    @Singleton
    fun provideContext() : Context {
        return context.applicationContext
    }
}