package com.example.wishlist.data

import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name="wish-title")
    val title:String = "",
    @ColumnInfo(name="wish-desc")
    val description:String = ""
)


object DummyWish {
    val wishlist = listOf(
        Wish(title="Item 1", description = "The first item"),
        Wish(title="Item 2", description = "The second item"),
        Wish(title="Item 3", description = "The third item"),
        Wish(title="Item 4", description = "The fourth item"),
    )
}
