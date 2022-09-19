package com.example.viewmodel

import androidx.lifecycle.ViewModel

class MainActivity_ViewModel: ViewModel() {
    var number=0
    fun addNumber(){
        number++
    }
}