package com.kokhou.first.presentation.di.movie

import android.util.Log
import com.kokhou.first.domain.usecase.GetMoviesUseCase
import com.kokhou.first.domain.usecase.UpdateMoviesUseCase
import com.kokhou.first.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUsecase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        Log.i("Tag", "provideMovieViewModelFactory 2")
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUsecase
        )
    }
}