package pe.devpicon.android.mycleanarchitectureapplication.ui.mapper

import pe.devpicon.android.cleanarch.domain.model.Book
import pe.devpicon.android.mycleanarchitectureapplication.ui.listbook.BookView
import javax.inject.Inject

class PresentationMapper @Inject constructor() {
    fun mapFromDomain(book: Book) = BookView(
        book.id,
        book.name,
        book.authors[0]
    )
}
