package com.ambitioncompose.data.repository

import com.ambitioncompose.data.remote.api.auth.AuthApi
import com.ambitioncompose.data.remote.dto.BaseDTO
import com.ambitioncompose.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val authApi: AuthApi
) : AuthRepository {
    override suspend fun getNotification(
        url: String
    ): Flow<BaseDTO> {
        return authApi.getNotification(url)
    }
}