package pe.devpicon.android.mycleanarchitectureapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import pe.devpicon.android.mycleanarchitectureapplication.R

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel  = ViewModelProvider(this, MainViewModelFactory())
            .get(MainViewModel::class.java)

    }
}
