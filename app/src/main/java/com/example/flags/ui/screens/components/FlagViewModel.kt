package com.example.flags.ui.screens.components

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.flags.data.DummyData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class FlagViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(FlagListState())
    val uiState = _uiState.asStateFlow()

    private val maxListSize = DummyData.flagList.size

    init {
        _uiState.value = _uiState.value.copy(flags = DummyData.flagList)
    }

    fun randomList() = viewModelScope.launch{
        val randomListSize = (3 ..maxListSize).random() //The smallest list size is 3
        val shuffledList = DummyData.flagList
        _uiState.value = _uiState.value.copy(flags = shuffledList.subList(0, randomListSize))
    }
}