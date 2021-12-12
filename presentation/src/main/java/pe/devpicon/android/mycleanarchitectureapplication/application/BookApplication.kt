package pe.devpicon.android.mycleanarchitectureapplication.application

import android.app.Application

class BookApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        ApplicationContainer.init(this)
    }
}
