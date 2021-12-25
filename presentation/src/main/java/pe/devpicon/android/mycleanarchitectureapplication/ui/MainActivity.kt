package pe.devpicon.android.mycleanarchitectureapplication.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import pe.devpicon.android.mycleanarchitectureapplication.R
import pe.devpicon.android.mycleanarchitectureapplication.application.BookApplication

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var navHostFragment: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(
            this, MainViewModelFactory(
                (application as BookApplication).applicationContainer
            )
        )[MainViewModel::class.java]
    }
}
