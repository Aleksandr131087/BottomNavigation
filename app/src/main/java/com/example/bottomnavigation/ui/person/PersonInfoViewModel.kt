package com.example.bottomnavigation.ui.person

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PersonInfoViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Person fragment"
    }
    val text: LiveData<String> = _text}