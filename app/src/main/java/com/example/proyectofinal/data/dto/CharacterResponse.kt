package com.example.proyectofinal.data.dto

data class CharactersResponse(
    val results: List<CharacterDto>
)

data class CharacterDto(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val image: String
)
