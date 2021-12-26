package pe.devpicon.android.cleanarch.data.datasource.local

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import pe.devpicon.android.cleanarch.data.datasource.BookDataSource
import javax.inject.Inject

class LocalBookDataSource @Inject constructor(
    private val bookDao: BookDao
) : BookDataSource {
    override suspend fun getBooks(): List<BookEntity> = withContext(Dispatchers.IO) {
        bookDao.getAll()
    }

}

