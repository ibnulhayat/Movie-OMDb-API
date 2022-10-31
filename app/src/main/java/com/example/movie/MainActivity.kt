package com.example.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.movie.databinding.ActivityMainBinding
import com.example.movie.local_db.ConnectDatabase
import com.example.movie.local_db.Movie
import com.example.movie.main.MainViewModel
import com.example.movie.main.MainViewModelFactory
import com.example.movie.main.MovieRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val dao = ConnectDatabase.getDataBase(this).movieDao()
        val repository = MovieRepository(dao)

        mainViewModel =
            ViewModelProvider(this, MainViewModelFactory(repository)).get(MainViewModel::class.java)

        mainViewModel.getMovie().observe(this, Observer {

        })

    }
}