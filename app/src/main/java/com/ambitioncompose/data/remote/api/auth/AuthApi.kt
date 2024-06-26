package com.ambitioncompose.data.remote.api.auth

import com.ambitioncompose.data.remote.dto.BaseDTO
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Url

interface AuthApi {
    suspend fun getNotification(
        @Url url: String
    ): Flow<BaseDTO>

}