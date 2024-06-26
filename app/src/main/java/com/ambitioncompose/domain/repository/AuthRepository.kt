package com.ambitioncompose.domain.repository

import com.ambitioncompose.data.remote.dto.BaseDTO
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    suspend fun getNotification(url: String): Flow<BaseDTO>
}