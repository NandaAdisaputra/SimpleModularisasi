package com.nandaadisaputra.dagger.core.domain.repository

import com.nandaadisaputra.dagger.core.data.Resource
import com.nandaadisaputra.dagger.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface ITourismRepository {

    fun getAllTourism(): Flow<Resource<List<Tourism>>>

    fun getFavoriteTourism(): Flow<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)

}