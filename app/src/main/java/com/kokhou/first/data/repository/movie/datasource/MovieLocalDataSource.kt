package com.kokhou.first.data.repository.movie.datasource

import com.kokhou.first.data.model.movie.Movie


interface MovieLocalDataSource {
    suspend fun getMoviesFromDB(): List<Movie>
    suspend fun saveMoviesToDB(movies: List<Movie>)
    suspend fun clearAll()
}