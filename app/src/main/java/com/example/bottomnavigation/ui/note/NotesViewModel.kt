package com.example.bottomnavigation.ui.note

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotesViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Notes fragment"
    }
    val text: LiveData<String> = _text
}