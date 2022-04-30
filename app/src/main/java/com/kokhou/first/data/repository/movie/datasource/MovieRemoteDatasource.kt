package com.kokhou.first.data.repository.movie.datasource

import com.kokhou.first.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
    suspend fun getMovies(): Response<MovieList>
}