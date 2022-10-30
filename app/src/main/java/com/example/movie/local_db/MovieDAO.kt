package com.example.movie.local_db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MovieDAO {

    @Insert
    suspend fun insertMovie(movie: Movie)

    @Query("SELECT * FROM MOVIES")
    fun getMovie(): LiveData<List<Movie>>
}