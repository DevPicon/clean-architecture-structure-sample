package pe.devpicon.android.mycleanarchitectureapplication.application

import android.content.Context
import android.content.SharedPreferences
import pe.devpicon.android.cleanarch.data.datasource.BookDataSource
import pe.devpicon.android.cleanarch.data.datasource.local.LocalBookDataSource
import pe.devpicon.android.cleanarch.data.datasource.local.database.BookDatabase
import pe.devpicon.android.cleanarch.data.datasource.local.database.BookDatabase.Companion.createBookDatabase
import pe.devpicon.android.cleanarch.data.mapper.BookMapper
import pe.devpicon.android.cleanarch.data.repository.BookRepositoryImpl
import pe.devpicon.android.cleanarch.domain.repository.BookRepository
import pe.devpicon.android.cleanarch.domain.usecase.AddBookUseCase
import pe.devpicon.android.cleanarch.domain.usecase.GetBooksUseCase

class ApplicationContainer(context: Context) {

    private var sharedPreferences: SharedPreferences =
        context.getSharedPreferences("book-sharedprefs", Context.MODE_PRIVATE)

    private var bookDatabase: BookDatabase = createBookDatabase(context)

    private val bookDataSource: BookDataSource = LocalBookDataSource(bookDatabase.bookDao())

    private val bookMapper: BookMapper = BookMapper()

    private val bookRepository: BookRepository = BookRepositoryImpl(bookDataSource, bookMapper)

    val getBooksUseCase: GetBooksUseCase by lazy { GetBooksUseCase(bookRepository) }

    val addBookUseCase: AddBookUseCase by lazy { AddBookUseCase() }

}
