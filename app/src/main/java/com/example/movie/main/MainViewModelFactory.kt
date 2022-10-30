package com.example.movie.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.movie.local_db.ConnectDatabase

class MainViewModelFactory(private val dataBase: ConnectDatabase) : ViewModelProvider.Factory{
    override fun <T: ViewModel> create(modelClass: Class<T>) : T{
        return MainViewModel(dataBase) as T
    }
}