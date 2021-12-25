package pe.devpicon.android.cleanarch.data.datasource.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "books")
data class BookEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "isbn") val isbn: String?,
    @ColumnInfo(name = "pages") val pages: Int,
    @ColumnInfo(name = "author") val author: String
)
