package com.kokhou.first.domain.usecase

import com.kokhou.first.data.model.tvshow.TvShow
import com.kokhou.first.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.updateTvShows()
}