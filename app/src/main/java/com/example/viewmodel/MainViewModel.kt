package com.example.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel(val initializeValue: Int) : ViewModel() {
    var count: Int = initializeValue
    fun increment(){
        count++
    }
}