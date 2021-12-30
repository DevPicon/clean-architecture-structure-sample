package pe.devpicon.android.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import pe.devpicon.android.cleanarch.data.datasource.BookDataSource
import pe.devpicon.android.cleanarch.data.datasource.local.BookDao
import pe.devpicon.android.cleanarch.data.datasource.local.LocalBookDataSource

@Module
@InstallIn(ViewModelComponent::class)
object LocalDatasourceModule {

    @Provides
    fun provideBookDatasource(bookDao: BookDao): BookDataSource = LocalBookDataSource(bookDao)

}
