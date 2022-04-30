package com.kokhou.first.presentation.di.core

import com.kokhou.first.data.repository.artist.datasource.ArtistCacheDataSource
import com.kokhou.first.data.repository.artist.datasourceImpl.ArtistCacheDataSourceImpl
import com.kokhou.first.data.repository.movie.datasource.MovieCacheDataSource
import com.kokhou.first.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.kokhou.first.data.repository.tvshow.datasource.TvShowCacheDataSource
import com.kokhou.first.data.repository.tvshow.datasourceImpl.TvShowCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideTvShowCacheDataSource(): TvShowCacheDataSource {
        return TvShowCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideArtistCacheDataSource(): ArtistCacheDataSource {
        return ArtistCacheDataSourceImpl()
    }


}