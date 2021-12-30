package pe.devpicon.android.data.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import pe.devpicon.android.cleanarch.data.datasource.local.BookDao
import pe.devpicon.android.cleanarch.data.datasource.local.database.BookDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    lateinit var bookDatabase: BookDatabase

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context):BookDatabase {
        bookDatabase = Room.databaseBuilder(
            context,
            BookDatabase::class.java, "book-database"
        )
            .createFromAsset("database/book-database")
            .build()
        return bookDatabase
    }

    @Provides
    fun provideBookDao(bookDatabase: BookDatabase):BookDao{
        return bookDatabase.bookDao()
    }

}
