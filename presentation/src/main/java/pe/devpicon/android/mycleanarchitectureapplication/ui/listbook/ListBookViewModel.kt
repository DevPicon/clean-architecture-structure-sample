package pe.devpicon.android.mycleanarchitectureapplication.ui.listbook

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import pe.devpicon.android.cleanarch.domain.usecase.GetBooksUseCase
import javax.inject.Inject

@HiltViewModel
class ListBookViewModel @Inject constructor(
    private val getBooksUseCase: GetBooksUseCase
) : ViewModel() {

    private var _bookViewList: MutableLiveData<List<BookView>> = MutableLiveData(
        listOf<BookView>(
            BookView(1, "One book", "Unknown author"),
            BookView(1, "Two book", "An author"),
            BookView(1, "Three book", "An author"),
            BookView(1, "Four book", "Another author"),
            BookView(1, "Five book", "An author"),
            BookView(1, "Six book", "Another author")
        )
    )
    val bookViewList: LiveData<List<BookView>> = _bookViewList


}
