package pe.devpicon.android.mycleanarchitectureapplication.ui

import androidx.lifecycle.ViewModel
import pe.devpicon.android.cleanarch.domain.usecase.AddBookUseCase

class MainViewModel(
    val addBookUseCase: AddBookUseCase
) : ViewModel() {
}


