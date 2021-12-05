package pe.devpicon.android.cleanarch.data.repository

import pe.devpicon.android.cleanarch.data.datasource.BookDataSource
import pe.devpicon.android.cleanarch.data.datasource.local.BookEntity
import pe.devpicon.android.cleanarch.data.mapper.BookMapper
import pe.devpicon.android.cleanarch.domain.model.Book
import pe.devpicon.android.cleanarch.domain.repository.BookRepository

class BookRepositoryImpl(
    private val bookDataSource: BookDataSource,
    private val bookMapper: BookMapper
) : BookRepository {
    override fun getBooks(): List<Book> {
        return bookDataSource
            .getBooks()
            .map { bookEntity: BookEntity -> bookMapper.fromBookEntity(bookEntity) }
    }
}
