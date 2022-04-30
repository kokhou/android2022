package com.kokhou.first.data.repository.tvshow.datasource

import com.kokhou.first.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
    suspend fun getTvShows(): Response<TvShowList>
}