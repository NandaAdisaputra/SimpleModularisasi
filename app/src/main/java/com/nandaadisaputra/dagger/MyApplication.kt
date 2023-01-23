package com.nandaadisaputra.dagger

import android.app.Application
import com.nandaadisaputra.dagger.core.di.CoreComponent
import com.nandaadisaputra.dagger.core.di.DaggerCoreComponent
import com.nandaadisaputra.dagger.di.AppComponent
import com.nandaadisaputra.dagger.di.DaggerAppComponent

open class MyApplication : Application() {

    private val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.factory().create(applicationContext)
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(coreComponent)
    }
}