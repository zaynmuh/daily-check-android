package com.zen.dailycheck.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

abstract class BaseViewModel<State : UiState, Event : UiEvent, Effect : UiEffect>(
    initialState: State
) : ViewModel() {

    // Common State Management
    private val _uiState = MutableStateFlow(initialState)
    val uiState = _uiState.asStateFlow()

    // Common Side Effect Management
    private val _effect = Channel<Effect>()
    val effect = _effect.receiveAsFlow()

    // Enforce state updates through a protected helper
    protected fun updateState(reducer: (State) -> State) {
        _uiState.value = reducer(_uiState.value)
    }

    // Enforce effect dispatching through a protected helper
    protected fun sendEffect(effect: Effect) {
        viewModelScope.launch {
            _effect.send(effect)
        }
    }

    // Every ViewModel extending this must implement the single entry point
    abstract fun onEvent(event: Event)
}