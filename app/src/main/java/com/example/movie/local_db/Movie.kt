package com.example.movie.local_db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies")
data class Movie (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val imdbID: String,
    val type: String,
    val year: String,
    val poster: String
    )