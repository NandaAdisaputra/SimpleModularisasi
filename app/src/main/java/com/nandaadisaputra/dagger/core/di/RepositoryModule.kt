package com.nandaadisaputra.dagger.core.di

import com.nandaadisaputra.dagger.core.data.TourismRepository
import com.nandaadisaputra.dagger.core.domain.repository.ITourismRepository
import dagger.Binds
import dagger.Module

@Module(includes = [NetworkModule::class, DatabaseModule::class])
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository

}