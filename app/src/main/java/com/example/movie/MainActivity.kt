package com.example.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.example.movie.local_db.ConnectDatabase
import com.example.movie.local_db.Movie
import com.example.movie.main.MainViewModel
import com.example.movie.main.MainViewModelFactory
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var database: ConnectDatabase
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = ConnectDatabase.getDataBase(this)
        mainViewModel = ViewModelProvider(this, MainViewModelFactory(database)).get(MainViewModel::class.java)

        mainViewModel.getTotalMovieList().observe(this, Observer {
            it
        })
    }
}