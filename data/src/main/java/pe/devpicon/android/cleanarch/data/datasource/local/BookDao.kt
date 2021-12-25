package pe.devpicon.android.cleanarch.data.datasource.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BookDao {

    @Query("SELECT * FROM books")
    fun getAll():List<BookEntity>

    @Insert
    fun insertAll(vararg books: BookEntity)

}
