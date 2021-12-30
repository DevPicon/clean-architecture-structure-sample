package pe.devpicon.android.di.domain

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import pe.devpicon.android.cleanarch.domain.repository.BookRepository
import pe.devpicon.android.cleanarch.domain.usecase.GetBooksUseCase

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {

    @Provides
    fun provideGetBooksUseCase(
        bookRepository: BookRepository
    ): GetBooksUseCase {
        return GetBooksUseCase(bookRepository)
    }

}
