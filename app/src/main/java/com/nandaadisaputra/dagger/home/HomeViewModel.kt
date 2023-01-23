package com.nandaadisaputra.dagger.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.nandaadisaputra.dagger.core.domain.usecase.TourismUseCase


class HomeViewModel(tourismUseCase: TourismUseCase) : ViewModel() {
    val tourism = tourismUseCase.getAllTourism().asLiveData()
}
