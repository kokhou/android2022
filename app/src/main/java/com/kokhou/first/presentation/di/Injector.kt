package com.kokhou.first.presentation.di

import com.kokhou.first.presentation.di.artist.ArtistSubComponent
import com.kokhou.first.presentation.di.movie.MovieSubComponent
import com.kokhou.first.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}