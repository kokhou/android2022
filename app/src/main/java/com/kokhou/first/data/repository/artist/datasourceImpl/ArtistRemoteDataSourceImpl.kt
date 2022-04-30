package com.kokhou.first.data.repository.artist.datasourceImpl

import com.kokhou.first.data.api.TMDBService
import com.kokhou.first.data.model.artist.ArtistList
import com.kokhou.first.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : ArtistRemoteDatasource {
    override suspend fun getArtists()
            : Response<ArtistList> = tmdbService.getPopularArtists(apiKey)

}

