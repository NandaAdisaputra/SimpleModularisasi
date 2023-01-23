package com.nandaadisaputra.dagger.di

import com.nandaadisaputra.dagger.core.domain.usecase.TourismInteraction
import com.nandaadisaputra.dagger.core.domain.usecase.TourismUseCase
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {

    @Binds
    abstract fun provideTourismUseCase(tourismInteractor: TourismInteraction): TourismUseCase

}
