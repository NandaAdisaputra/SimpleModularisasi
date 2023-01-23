package com.nandaadisaputra.dagger.core.di

import android.content.Context
import com.nandaadisaputra.dagger.core.data.TourismRepository
import com.nandaadisaputra.dagger.core.data.source.local.LocalDataSource
import com.nandaadisaputra.dagger.core.data.source.local.room.TourismDatabase
import com.nandaadisaputra.dagger.core.data.source.remote.RemoteDataSource
import com.nandaadisaputra.dagger.core.data.source.remote.network.ApiConfig
import com.nandaadisaputra.dagger.core.domain.repository.ITourismRepository
import com.nandaadisaputra.dagger.core.domain.usecase.TourismInteraction
import com.nandaadisaputra.dagger.core.domain.usecase.TourismUseCase
import com.nandaadisaputra.dagger.core.utils.AppExecutors


object Injection {
    private fun provideRepository(context: Context): ITourismRepository {
        val database = TourismDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(ApiConfig.provideApiService())
        val localDataSource = LocalDataSource.getInstance(database.tourismDao())
        val appExecutors = AppExecutors()

        return TourismRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }

    fun provideTourismUseCase(context: Context): TourismUseCase {
        val repository = provideRepository(context)
        return TourismInteraction(repository)
    }
}