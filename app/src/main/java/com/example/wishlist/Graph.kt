package com.example.wishlist

import android.content.Context
import androidx.room.Room
import com.example.wishlist.data.WishDatabase
import com.example.wishlist.data.WishRepository

object Graph {
    lateinit var database: WishDatabase

    // lazy makes it so DB is loaded when needs to be used not when app is launched
    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provide(context: Context) {
        database = Room.databaseBuilder(context,WishDatabase::class.java, "wishlist.db").build()
    }

}