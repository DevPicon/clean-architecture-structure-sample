package pe.devpicon.android.cleanarch.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import pe.devpicon.android.cleanarch.data.datasource.BookDataSource
import pe.devpicon.android.cleanarch.data.datasource.local.LocalBookDataSource

@Module
@InstallIn(ViewModelComponent::class)
abstract class LocalDatasourceModule {

    @Binds
    abstract fun bindBookDatasource(
        localBookDataSource: LocalBookDataSource
    ): BookDataSource

}
