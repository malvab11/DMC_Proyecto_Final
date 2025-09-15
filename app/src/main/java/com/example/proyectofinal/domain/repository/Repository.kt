package com.example.proyectofinal.domain.repository

import com.example.proyectofinal.domain.entity.CharacterEntity
import kotlinx.coroutines.flow.Flow

interface Repository {
    fun getCharacters(): Flow<List<CharacterEntity>>
}