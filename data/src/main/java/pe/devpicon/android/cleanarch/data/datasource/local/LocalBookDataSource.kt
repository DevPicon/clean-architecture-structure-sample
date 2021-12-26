package pe.devpicon.android.cleanarch.data.datasource.local

import pe.devpicon.android.cleanarch.data.datasource.BookDataSource
import javax.inject.Inject

class LocalBookDataSource @Inject constructor(
    private val bookDao: BookDao
): BookDataSource {
    override fun getBooks(): List<BookEntity> {
        return bookDao.getAll()
    }

}

