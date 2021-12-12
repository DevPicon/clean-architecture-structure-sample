package pe.devpicon.android.cleanarch.data.datasource.local

import pe.devpicon.android.cleanarch.data.datasource.BookDataSource

class LocalBookDataSource(
    private val bookDao: BookDao
): BookDataSource {
    override fun getBooks(): List<BookEntity> {
        TODO("Not yet implemented")
    }

}

