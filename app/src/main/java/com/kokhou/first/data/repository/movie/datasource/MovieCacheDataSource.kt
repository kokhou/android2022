package com.kokhou.first.data.repository.movie.datasource

import com.kokhou.first.data.model.movie.Movie


interface MovieCacheDataSource {
    suspend fun getMoviesFromCache(): List<Movie>
    suspend fun saveMoviesToCache(movies: List<Movie>)

}