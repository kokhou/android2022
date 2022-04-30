package com.kokhou.first.presentation.di.core

import android.content.Context
import android.util.Log
import com.kokhou.first.presentation.di.artist.ArtistSubComponent
import com.kokhou.first.presentation.di.movie.MovieSubComponent
import com.kokhou.first.presentation.di.tvshow.TvShowSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [MovieSubComponent::class, TvShowSubComponent::class, ArtistSubComponent::class])
class AppModule(private val context: Context) {

    @Singleton
    @Provides
    fun provideApplicationContext(): Context {
        Log.i("Tag", "provideApplicationContext 1")
        return context.applicationContext
    }


}