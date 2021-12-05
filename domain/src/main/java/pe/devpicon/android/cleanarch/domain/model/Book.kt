package pe.devpicon.android.cleanarch.domain.model

data class Book(
    val id:Int,
    val name: String,
    val authors: Array<String>,
    val pages: Int,
    val volumen: Int,
    val isbnCode: String? = null
)
