package com.example.recycleviewer

import androidx.lifecycle.ViewModel

class MyViewModel () :  ViewModel() {

    val data = arrayListOf<MyData>()

    override fun onCleared() {
        super.onCleared()
    }
}