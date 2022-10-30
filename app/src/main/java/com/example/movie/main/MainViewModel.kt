package com.example.movie.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.movie.local_db.ConnectDatabase
import com.example.movie.local_db.Movie

class MainViewModel(private val database: ConnectDatabase): ViewModel() {

    fun getTotalMovieList(): LiveData<List<Movie>>{
       return database.movieDao().getMovie()
    }
}