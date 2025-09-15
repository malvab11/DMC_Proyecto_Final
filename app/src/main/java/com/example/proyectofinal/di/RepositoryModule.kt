package com.example.proyectofinal.di

import com.example.proyectofinal.data.repository.RepositoryImpl
import com.example.proyectofinal.domain.repository.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindCharacterRepository(
        characterRepositoryImpl: RepositoryImpl
    ): Repository
}