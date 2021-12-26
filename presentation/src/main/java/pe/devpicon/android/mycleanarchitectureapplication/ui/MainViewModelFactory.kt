package pe.devpicon.android.mycleanarchitectureapplication.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import pe.devpicon.android.mycleanarchitectureapplication.application.ApplicationContainer
import pe.devpicon.android.mycleanarchitectureapplication.ui.listbook.ListBookViewModel

class MainViewModelFactory(private val applicationContainer: ApplicationContainer) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return with(modelClass) {
            when {
                isAssignableFrom(MainViewModel::class.java) -> MainViewModel( )
                else -> error("Unknown ViewModel class: ${modelClass.name}")
            } as T
        }
    }
}
