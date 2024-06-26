package com.ambitioncompose.domain.use_case

import com.ambitioncompose.domain.repository.AuthRepository
import javax.inject.Inject

class getNotificationUseCase @Inject constructor(
    private val authRepository: AuthRepository
) {
    suspend operator fun invoke(
        url: String
    ) = authRepository.getNotification(url)
}
