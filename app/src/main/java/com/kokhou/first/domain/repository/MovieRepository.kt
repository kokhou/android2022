package com.kokhou.first.domain.repository

import com.kokhou.first.data.model.movie.Movie


interface MovieRepository {

    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?

}