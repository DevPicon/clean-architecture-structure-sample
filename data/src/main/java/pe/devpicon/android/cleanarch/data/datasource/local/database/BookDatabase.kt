package pe.devpicon.android.cleanarch.data.datasource.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import pe.devpicon.android.cleanarch.data.datasource.local.BookDao
import pe.devpicon.android.cleanarch.data.datasource.local.BookEntity

@Database(entities = [BookEntity::class], version = 1)
abstract class BookDatabase : RoomDatabase() {
    abstract fun bookDao(): BookDao
}
