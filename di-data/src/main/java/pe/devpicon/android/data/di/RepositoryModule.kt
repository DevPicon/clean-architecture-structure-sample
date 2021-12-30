package pe.devpicon.android.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import pe.devpicon.android.cleanarch.data.datasource.BookDataSource
import pe.devpicon.android.cleanarch.data.mapper.BookMapper
import pe.devpicon.android.cleanarch.data.repository.BookRepositoryImpl
import pe.devpicon.android.cleanarch.domain.repository.BookRepository

@Module
@InstallIn(ViewModelComponent::class)
object RepositoryModule {

    @Provides
    fun provideBookRepository(
        bookDataSource: BookDataSource,
        bookMapper: BookMapper
    ): BookRepository =
        BookRepositoryImpl(bookDataSource, bookMapper)

    @Provides
    fun provideMapper(): BookMapper = BookMapper()
}
