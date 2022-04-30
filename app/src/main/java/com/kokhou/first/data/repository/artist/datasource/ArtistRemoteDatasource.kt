package com.kokhou.first.data.repository.artist.datasource

import com.kokhou.first.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDatasource {
    suspend fun getArtists(): Response<ArtistList>
}