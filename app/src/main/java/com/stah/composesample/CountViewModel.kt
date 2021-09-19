package com.stah.composesample

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

class CountViewModel {
    val count: MutableState<Int> = mutableStateOf(0)

    fun onCountUpTapped() {
        val currentValue = requireNotNull(count.value)
        count.value = currentValue + 1
    }
}
