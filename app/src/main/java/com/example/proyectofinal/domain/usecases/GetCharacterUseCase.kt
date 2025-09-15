package com.example.proyectofinal.domain.usecases

import com.example.proyectofinal.domain.entity.CharacterEntity
import com.example.proyectofinal.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCharacterUseCase @Inject constructor(
    private val repository: Repository
) {
    operator fun invoke(): Flow<List<CharacterEntity>> = repository.getCharacters()
}