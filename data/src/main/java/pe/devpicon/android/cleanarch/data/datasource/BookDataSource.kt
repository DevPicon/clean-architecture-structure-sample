package pe.devpicon.android.cleanarch.data.datasource

import pe.devpicon.android.cleanarch.data.datasource.local.BookEntity

interface BookDataSource{
    fun getBooks():List<BookEntity>
}
