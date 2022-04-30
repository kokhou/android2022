package com.kokhou.first.presentation.di.tvshow

import com.kokhou.first.domain.usecase.GetTvShowsUseCase
import com.kokhou.first.domain.usecase.UpdateTvShowsUseCase
import com.kokhou.first.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {
    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }

}