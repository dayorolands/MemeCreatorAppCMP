package com.dayorolands.memecreatorappincmp

import android.app.Application
import com.dayorolands.memecreatorappincmp.di.initKoin
import org.koin.android.ext.koin.androidContext

class MemeCreatorApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MemeCreatorApplication)
        }
    }
}