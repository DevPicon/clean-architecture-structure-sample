package pe.devpicon.android.mycleanarchitectureapplication.application

import android.content.Context
import android.content.SharedPreferences

class ApplicationContainer(context: Context) {

    private var sharedPreferences: SharedPreferences =
        context.getSharedPreferences("book-sharedprefs", Context.MODE_PRIVATE)

}
