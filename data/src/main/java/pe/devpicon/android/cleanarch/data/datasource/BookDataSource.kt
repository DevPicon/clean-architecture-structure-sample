package pe.devpicon.android.cleanarch.data.datasource

import pe.devpicon.android.cleanarch.data.datasource.local.BookEntity

interface BookDataSource{
   suspend fun getBooks():List<BookEntity>
}
