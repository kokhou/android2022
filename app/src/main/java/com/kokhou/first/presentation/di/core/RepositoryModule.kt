package com.kokhou.first.presentation.di.core

import android.util.Log
import com.kokhou.first.data.repository.artist.ArtistRepositoryImpl
import com.kokhou.first.data.repository.artist.datasource.ArtistCacheDataSource
import com.kokhou.first.data.repository.artist.datasource.ArtistLocalDataSource
import com.kokhou.first.data.repository.artist.datasource.ArtistRemoteDatasource
import com.kokhou.first.data.repository.movie.MovieRepositoryImpl
import com.kokhou.first.data.repository.movie.datasource.MovieCacheDataSource
import com.kokhou.first.data.repository.movie.datasource.MovieLocalDataSource
import com.kokhou.first.data.repository.movie.datasource.MovieRemoteDatasource
import com.kokhou.first.data.repository.tvshow.TvShowRepositoryImpl
import com.kokhou.first.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.kokhou.first.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.kokhou.first.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.kokhou.first.domain.repository.ArtistRepository
import com.kokhou.first.domain.repository.MovieRepository
import com.kokhou.first.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {
        Log.i("Tag", "provideMovieRepository 3")
        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }

    @Provides
    @Singleton
    fun provideTvShowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDataSource: TvShowLocalDataSource,
        tvShowCacheDataSource: TvShowCacheDataSource
    ): TvShowRepository {
        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDataSource,
            tvShowCacheDataSource
        )
    }

    @Provides
    @Singleton
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDataSource: ArtistLocalDataSource,
        artistCacheDataSource: ArtistCacheDataSource
    ): ArtistRepository {
        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDataSource,
            artistCacheDataSource
        )
    }
}