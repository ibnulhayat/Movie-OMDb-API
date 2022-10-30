package com.example.movie.local_db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Movie::class], version = 1)
abstract class ConnectDatabase : RoomDatabase(){

    companion object{
        @Volatile
        private var INSTANCE: ConnectDatabase? = null

        fun getDataBase(context: Context) : ConnectDatabase{
            synchronized(this){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context,
                        ConnectDatabase::class.java,
                        "movieBD").build()
                }
            }
            return INSTANCE!!
        }
    }

    abstract fun movieDao(): MovieDAO
}