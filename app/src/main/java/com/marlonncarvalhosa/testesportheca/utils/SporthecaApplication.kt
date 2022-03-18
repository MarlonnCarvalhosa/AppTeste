package com.marlonncarvalhosa.testesportheca.utils

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.marlonncarvalhosa.testesportheca.di.listModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SporthecaApplication: Application(){
    override fun onCreate() {
        super.onCreate()
        instance = applicationContext
        startKoin{
            androidContext(this@SporthecaApplication)
            modules(listModules)
        }
    }

    companion object {
        @SuppressLint("StaticFieldLeak")
        var instance: Context? = null
            private set

    }
}