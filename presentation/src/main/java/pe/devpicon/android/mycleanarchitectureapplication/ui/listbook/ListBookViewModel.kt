package pe.devpicon.android.mycleanarchitectureapplication.ui.listbook

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import pe.devpicon.android.cleanarch.domain.usecase.GetBooksUseCase
import pe.devpicon.android.mycleanarchitectureapplication.ui.mapper.PresentationMapper
import javax.inject.Inject

@HiltViewModel
class ListBookViewModel @Inject constructor(
    private val getBooksUseCase: GetBooksUseCase,
    private val presentationMapper: PresentationMapper
) : ViewModel() {

    init {
        getBookViewList()
    }

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


    private fun getBookViewList(){
        viewModelScope.launch {
            val bookViewList = getBooksUseCase().map { presentationMapper.mapFromDomain(it) }
            _bookViewList.postValue(bookViewList)
        }
    }

}
