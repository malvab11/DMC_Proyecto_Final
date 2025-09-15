package com.example.proyectofinal.data.repository

import com.example.proyectofinal.data.mapper.CharacterMapper
import com.example.proyectofinal.data.remote.ApiServices
import com.example.proyectofinal.domain.entity.CharacterEntity
import com.example.proyectofinal.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val apiService: ApiServices
) : Repository {
    override fun getCharacters(): Flow<List<CharacterEntity>> = flow {
        try {
            val response = apiService.getCharacters()
            val entities = response.results.map { CharacterMapper.toEntity(it) }
            emit(entities)
        } catch (e: Exception) {
            emit(emptyList())
        }
    }
}