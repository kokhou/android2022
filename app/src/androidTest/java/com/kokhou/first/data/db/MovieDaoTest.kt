package com.kokhou.first.data.db

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.kokhou.first.data.model.movie.Movie
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.google.common.truth.Truth.assertThat


@RunWith(AndroidJUnit4::class)
class MovieDaoTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var dao: MovieDao
    private lateinit var database: TMDBDatabase

    @Before
    fun setUp() {
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            TMDBDatabase::class.java
        ).build()

        dao = database.movieDao()
    }

    @After
    fun tearDown() {
        database.close()
    }

    @Test
    fun saveMoviesTest() = runBlocking {
        val movies = listOf(
            Movie(1, "abc", "abc", "abc", "abc"),
            Movie(2, "abc2", "abc2", "abc2", "abc2"),
            Movie(3, "abc3", "abc3", "abc3", "abc3"),
        )

        dao.saveMovies(movies)

        val allMovies = dao.getMovies()
        assertThat(allMovies).isEqualTo(movies)

    }

    @Test
    fun deleteMoviesTest() = runBlocking {
        val movies = listOf(
            Movie(1, "abc", "abc", "abc", "abc"),
            Movie(2, "abc2", "abc2", "abc2", "abc2"),
            Movie(3, "abc3", "abc3", "abc3", "abc3"),
        )

        dao.saveMovies(movies)

        dao.deleteAllMovies()
        val moviesResult = dao.getMovies()
        assertThat(moviesResult).isEmpty()
    }
}