package com.example.movie.local_db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Movie::class], version = 1)
abstract class ConnectDatabase : RoomDatabase(){

    abstract fun connectDao(): MovieDAO
}