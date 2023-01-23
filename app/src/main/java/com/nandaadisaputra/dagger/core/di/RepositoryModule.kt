package com.nandaadisaputra.dagger.core.di

import com.nandaadisaputra.dagger.core.data.TourismRepository
import com.nandaadisaputra.dagger.core.domain.repository.ITourismRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

//@Module(includes = [NetworkModule::class, DatabaseModule::class])
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository

}