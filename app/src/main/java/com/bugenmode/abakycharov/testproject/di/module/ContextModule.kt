package com.bugenmode.abakycharov.testproject.di.module

import android.content.Context
import android.support.v7.app.AppCompatActivity
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton

@Module
class ContextModule(private val context: Context) {

    @Provides
    @Singleton
    fun provideContext() : Context {
        return context.applicationContext
    }


    @Provides
    fun provideCompositeDisposable() : CompositeDisposable {
        return CompositeDisposable()
    }


}