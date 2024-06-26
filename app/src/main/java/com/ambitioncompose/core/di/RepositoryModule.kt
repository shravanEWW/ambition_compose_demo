package com.ambitioncompose.core.di

import com.ambitioncompose.data.remote.api.auth.AuthApi
import com.ambitioncompose.data.repository.AuthRepositoryImpl
import com.ambitioncompose.domain.repository.AuthRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideAuthRepository(
        authApi: AuthApi,
    ):AuthRepository = AuthRepositoryImpl(
        authApi = authApi
    )
}