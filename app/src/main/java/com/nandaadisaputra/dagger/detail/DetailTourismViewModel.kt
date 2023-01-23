package com.nandaadisaputra.dagger.detail

import androidx.lifecycle.ViewModel
import com.nandaadisaputra.dagger.core.domain.model.Tourism
import com.nandaadisaputra.dagger.core.domain.usecase.TourismUseCase

class DetailTourismViewModel(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus:Boolean) =
        tourismUseCase.setFavoriteTourism(tourism, newStatus)
}