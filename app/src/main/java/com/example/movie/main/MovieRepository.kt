package com.example.movie.main

import androidx.lifecycle.LiveData
import com.example.movie.local_db.Movie
import com.example.movie.local_db.MovieDAO

class MovieRepository(private val movieDAO: MovieDAO) {

    fun getMovieFromRepo(): LiveData<List<Movie>> {
        return movieDAO.getMovieFromBD()
    }
}