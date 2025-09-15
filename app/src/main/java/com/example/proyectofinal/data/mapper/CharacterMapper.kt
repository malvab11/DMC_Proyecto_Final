package com.example.proyectofinal.data.mapper

import com.example.proyectofinal.data.dto.CharacterDto
import com.example.proyectofinal.domain.entity.CharacterEntity

object CharacterMapper {
    fun toEntity(dto: CharacterDto): CharacterEntity = CharacterEntity(
        id = dto.id,
        name = dto.name,
        status = dto.status,
        species = dto.species,
        image = dto.image
    )
}