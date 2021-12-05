package pe.devpicon.android.cleanarch.domain.usecase

import pe.devpicon.android.cleanarch.domain.model.Book
import pe.devpicon.android.cleanarch.domain.repository.BookRepository

class GetBooksUseCase(
    private val bookRepository: BookRepository
) {
    operator fun invoke(): List<Book> {
        return bookRepository.getBooks()
    }
}
