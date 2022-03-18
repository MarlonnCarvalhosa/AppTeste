package com.marlonncarvalhosa.testesportheca.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.marlonncarvalhosa.testesportheca.data.repository.PlayerRepository
import com.marlonncarvalhosa.testesportheca.data.response.DataResponse
import com.marlonncarvalhosa.testesportheca.data.response.PlayerResponse
import com.marlonncarvalhosa.testesportheca.utils.Failed
import com.marlonncarvalhosa.testesportheca.utils.Loading
import com.marlonncarvalhosa.testesportheca.utils.Resource
import com.marlonncarvalhosa.testesportheca.utils.Success
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class MainViewModel(private val repository: PlayerRepository): ViewModel() {

    private val resultLiveData = MutableStateFlow<Resource<DataResponse>>(Loading())
    val _resultLiveData: StateFlow<Resource<DataResponse>>
    get() = resultLiveData

    init {
        getPlayer()
    }

    fun getPlayer() {
        viewModelScope.launch {
            repository.getPlayer()
                .onStart {
                    resultLiveData.value = Loading()
                }
                .catch {
                    resultLiveData.value = Failed()
                }
                .collect {
                    resultLiveData.value = Success(it)
                }
        }
    }
}