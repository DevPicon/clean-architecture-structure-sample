package pe.devpicon.android.mycleanarchitectureapplication.application

import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import pe.devpicon.android.cleanarch.data.datasource.BookDataSource
import pe.devpicon.android.cleanarch.data.datasource.local.LocalBookDataSource
import pe.devpicon.android.cleanarch.data.datasource.local.database.BookDatabase
import pe.devpicon.android.cleanarch.data.mapper.BookMapper
import pe.devpicon.android.cleanarch.data.repository.BookRepositoryImpl
import pe.devpicon.android.cleanarch.domain.repository.BookRepository
import pe.devpicon.android.cleanarch.domain.usecase.AddBookUseCase
import pe.devpicon.android.cleanarch.domain.usecase.GetBooksUseCase

object ApplicationContainer {

    private lateinit var sharedPreferences: SharedPreferences

    private lateinit var bookDatabase: BookDatabase

    fun init(context: Context) {
        sharedPreferences = context.getSharedPreferences("book-sharedprefs", Context.MODE_PRIVATE)
        bookDatabase = createBookDatabase(context)
    }

    private fun createBookDatabase(context: Context): BookDatabase = Room.databaseBuilder(
        context,
        BookDatabase::class.java, "book-database"
    ).build()

    private val bookDataSource: BookDataSource = LocalBookDataSource(bookDatabase.bookDao())

    private val bookMapper: BookMapper = BookMapper()

    private val bookRepository: BookRepository by lazy {
        BookRepositoryImpl(bookDataSource, bookMapper)
    }

    val getBooksUseCase: GetBooksUseCase by lazy { GetBooksUseCase(bookRepository) }

    val addBookUseCase: AddBookUseCase by lazy { AddBookUseCase() }

}
