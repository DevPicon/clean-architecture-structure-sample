package pe.devpicon.android.mycleanarchitectureapplication.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BookApplication : Application() {

    lateinit var applicationContainer: ApplicationContainer

    override fun onCreate() {
        super.onCreate()

        applicationContainer = ApplicationContainer(this)
    }
}
