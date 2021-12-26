package pe.devpicon.android.cleanarch.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import pe.devpicon.android.cleanarch.data.repository.BookRepositoryImpl
import pe.devpicon.android.cleanarch.domain.repository.BookRepository

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindBookRepository(
        bookRepositoryImpl: BookRepositoryImpl
    ): BookRepository
}
