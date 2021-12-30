package pe.devpicon.android.di.domain

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import pe.devpicon.android.cleanarch.data.datasource.local.LocalBookDataSource
import pe.devpicon.android.cleanarch.data.datasource.local.database.BookDatabase
import pe.devpicon.android.cleanarch.data.mapper.BookMapper
import pe.devpicon.android.cleanarch.data.repository.BookRepositoryImpl
import pe.devpicon.android.cleanarch.domain.usecase.GetBooksUseCase

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideGetBooksUseCase(@ApplicationContext context: Context): GetBooksUseCase =
        GetBooksUseCase(
            BookRepositoryImpl(
                LocalBookDataSource(
                    privatelyProvideLocalDatabase(context).bookDao()
                ), BookMapper()
            )
        )



    private lateinit var database: BookDatabase
    @Synchronized
    private fun privatelyProvideLocalDatabase(context: Context): BookDatabase {
        if (!::database.isInitialized) {
            database = Room.databaseBuilder(
                context,
                BookDatabase::class.java, "book-database"
            )
                .createFromAsset("database/book-database")
                .build()
            return database

        }
        return database
    }

}
