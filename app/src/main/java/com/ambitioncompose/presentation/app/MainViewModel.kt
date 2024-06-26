package com.ambitioncompose.presentation.app

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ambitioncompose.core.constants.Constants
import com.ambitioncompose.domain.use_case.getNotificationUseCase
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getNotificationUseCase: getNotificationUseCase
) : ViewModel() {

    fun getNotification(){
        viewModelScope.launch {
            getNotificationUseCase.invoke(Constants.BASE_URL.plus("notification"))
        }
    }
}