package pe.devpicon.android.cleanarch.data.mapper

import pe.devpicon.android.cleanarch.data.datasource.local.BookEntity
import pe.devpicon.android.cleanarch.domain.model.Book

class BookMapper constructor() {
    fun fromBookEntity(entity: BookEntity): Book = with(entity) {
        return Book(
            id = id,
            name = name,
            authors = arrayOf(author),
            pages = pages,
            volumen = 1,
            isbnCode = isbn
        )
    }
}
