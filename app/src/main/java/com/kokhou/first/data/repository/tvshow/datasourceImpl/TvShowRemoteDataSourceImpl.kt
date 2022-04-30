package com.kokhou.first.data.repository.tvshow.datasourceImpl

import com.kokhou.first.data.api.TMDBService
import com.kokhou.first.data.model.tvshow.TvShowList
import com.kokhou.first.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : TvShowRemoteDatasource {
    override suspend fun getTvShows()
            : Response<TvShowList> = tmdbService.getPopularTvShows(apiKey)

}

