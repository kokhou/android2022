package com.kokhou.first.presentation

import android.app.Application
import android.util.Log
import com.kokhou.first.BuildConfig
import com.kokhou.first.presentation.di.Injector
import com.kokhou.first.presentation.di.artist.ArtistSubComponent
import com.kokhou.first.presentation.di.core.*
import com.kokhou.first.presentation.di.movie.MovieSubComponent
import com.kokhou.first.presentation.di.tvshow.TvShowSubComponent

class App : Application(), Injector {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()

    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }

    override fun createTvShowSubComponent(): TvShowSubComponent {
        return appComponent.tvShowSubComponent().create()
    }

    override fun createArtistSubComponent(): ArtistSubComponent {
        return appComponent.artistSubComponent().create()
    }

}