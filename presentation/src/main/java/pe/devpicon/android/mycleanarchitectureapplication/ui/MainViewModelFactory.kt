package pe.devpicon.android.mycleanarchitectureapplication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import pe.devpicon.android.mycleanarchitectureapplication.application.ApplicationContainer

class MainViewModelFactory() : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return with(modelClass) {
            when {
                isAssignableFrom(MainViewModel::class.java) -> MainViewModel(
                    ApplicationContainer.addBookUseCase
                )
                else -> error("Unknown ViewModel class: ${modelClass.name}")
            } as T
        }
    }
}
