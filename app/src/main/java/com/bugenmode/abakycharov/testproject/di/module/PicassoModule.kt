package com.bugenmode.abakycharov.testproject.di.module

import android.content.Context
import com.squareup.picasso.OkHttp3Downloader
import com.squareup.picasso.Picasso
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
class PicassoModule {

    @Provides
    @Singleton
    fun providePicasso(context: Context, okHttp3Downloader: OkHttp3Downloader) : Picasso {
        return Picasso.Builder(context)
            .downloader(okHttp3Downloader)
            .build()
    }

    @Provides
    @Singleton
    fun provideOkHttp3DownLoader(okHttpClient: OkHttpClient) : OkHttp3Downloader {
        return OkHttp3Downloader(okHttpClient)
    }
}