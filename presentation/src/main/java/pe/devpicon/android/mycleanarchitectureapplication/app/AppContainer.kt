package pe.devpicon.android.mycleanarchitectureapplication.app

import pe.devpicon.android.cleanarch.data.datasource.BookDataSource
import pe.devpicon.android.cleanarch.data.datasource.local.LocalBookDataSource
import pe.devpicon.android.cleanarch.data.mapper.BookMapper
import pe.devpicon.android.cleanarch.data.repository.BookRepositoryImpl
import pe.devpicon.android.cleanarch.domain.repository.BookRepository
import pe.devpicon.android.cleanarch.domain.usecase.AddBookUseCase
import pe.devpicon.android.cleanarch.domain.usecase.GetBookUseCase
import pe.devpicon.android.cleanarch.domain.usecase.GetBooksUseCase

class AppContainer {
    private val bookDataSource: BookDataSource = LocalBookDataSource()

    private val bookRepository:BookRepository = BookRepositoryImpl(
        bookDataSource = bookDataSource,
        bookMapper = BookMapper()
    )

    val getBookUseCase:GetBookUseCase = GetBookUseCase()

    val getBooksUseCase:GetBooksUseCase by lazy { GetBooksUseCase(bookRepository = bookRepository) }

    val addBookUseCase:AddBookUseCase by lazy { AddBookUseCase() }
}
