package com.nandaadisaputra.dagger.di

import com.nandaadisaputra.dagger.core.di.CoreComponent
import com.nandaadisaputra.dagger.detail.DetailTourismActivity
import com.nandaadisaputra.dagger.favorite.FavoriteFragment
import com.nandaadisaputra.dagger.home.HomeFragment
import dagger.Component


@AppScope
@Component(
    dependencies = [CoreComponent::class],
//    modules = [AppModule::class]
    modules = [AppModule::class, ViewModelModule::class]
)
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): AppComponent
    }

    fun inject(fragment: HomeFragment)
    fun inject(fragment: FavoriteFragment)
    fun inject(activity: DetailTourismActivity)
}