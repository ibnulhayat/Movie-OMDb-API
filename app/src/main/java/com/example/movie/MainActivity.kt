package com.example.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.example.movie.local_db.ConnectDatabase
import com.example.movie.local_db.Movie
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var database: ConnectDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = ConnectDatabase.getDataBase(this)
        GlobalScope.launch {
            database.movieDao().insertMovie(Movie(0, "Don", "123", "Movie", "2000", "abc.com"))
        }
    }
}