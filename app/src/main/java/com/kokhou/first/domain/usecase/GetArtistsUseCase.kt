package com.kokhou.first.domain.usecase

import com.kokhou.first.data.model.artist.Artist
import com.kokhou.first.domain.repository.ArtistRepository

class GetArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute(): List<Artist>? = artistRepository.getArtists()

}