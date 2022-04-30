package com.kokhou.first.data.repository.movie.datasourceImpl

import com.kokhou.first.data.api.TMDBService
import com.kokhou.first.data.model.movie.MovieList
import com.kokhou.first.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : MovieRemoteDatasource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)
}

