package com.nandaadisaputra.dagger.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.nandaadisaputra.dagger.core.domain.usecase.TourismUseCase

class FavoriteViewModel(tourismUseCase: TourismUseCase) : ViewModel() {
    val favoriteTourism = tourismUseCase.getFavoriteTourism().asLiveData()
}
