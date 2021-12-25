package pe.devpicon.android.mycleanarchitectureapplication.application

import android.app.Application

class BookApplication : Application() {

    lateinit var applicationContainer: ApplicationContainer

    override fun onCreate() {
        super.onCreate()

        applicationContainer = ApplicationContainer(this)
    }
}
