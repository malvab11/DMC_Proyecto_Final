package com.example.proyectofinal.data.remote

import com.example.proyectofinal.data.dto.CharactersResponse
import retrofit2.http.GET

interface ApiServices {
    @GET("character")
    suspend fun getCharacters(): CharactersResponse
}