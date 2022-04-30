package com.kokhou.first.presentation.di.artist

import com.kokhou.first.domain.usecase.GetArtistsUseCase
import com.kokhou.first.domain.usecase.UpdateArtistsUseCase
import com.kokhou.first.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ArtistModule {
    @ArtistScope
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ): ArtistViewModelFactory {
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }

}