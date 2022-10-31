package com.example.movie.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.movie.local_db.Movie

class MainViewModel(private val movieRepository: MovieRepository) : ViewModel() {

    fun getMovie(): LiveData<List<Movie>> {
        return movieRepository.getMovieFromRepo()
    }

}