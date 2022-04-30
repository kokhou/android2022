package com.kokhou.first.presentation.di.core

import com.kokhou.first.data.db.ArtistDao
import com.kokhou.first.data.db.MovieDao
import com.kokhou.first.data.db.TvShowDao
import com.kokhou.first.data.repository.artist.datasource.ArtistLocalDataSource
import com.kokhou.first.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.kokhou.first.data.repository.movie.datasource.MovieLocalDataSource
import com.kokhou.first.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.kokhou.first.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.kokhou.first.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao): TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao): ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }


}