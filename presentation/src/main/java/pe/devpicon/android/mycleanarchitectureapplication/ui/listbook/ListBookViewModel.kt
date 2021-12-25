package pe.devpicon.android.mycleanarchitectureapplication.ui.listbook

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListBookViewModel : ViewModel() {

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
