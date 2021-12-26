package pe.devpicon.android.cleanarch.domain.repository

import pe.devpicon.android.cleanarch.domain.model.Book

interface BookRepository {
    suspend fun getBooks():List<Book>
}
