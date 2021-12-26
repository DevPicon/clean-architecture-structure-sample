package pe.devpicon.android.cleanarch.domain.usecase

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import pe.devpicon.android.cleanarch.domain.model.Book
import pe.devpicon.android.cleanarch.domain.repository.BookRepository

class GetBooksUseCase(
    private val bookRepository: BookRepository
) {
    suspend operator fun invoke(): List<Book> = withContext(Dispatchers.Default) {
        bookRepository.getBooks()
    }
}
