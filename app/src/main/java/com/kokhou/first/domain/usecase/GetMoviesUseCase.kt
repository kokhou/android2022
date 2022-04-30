package com.kokhou.first.domain.usecase

import com.kokhou.first.data.model.movie.Movie
import com.kokhou.first.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute(): List<Movie>? = movieRepository.getMovies()
}