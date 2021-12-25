package pe.devpicon.android.mycleanarchitectureapplication.ui.addbook

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pe.devpicon.android.mycleanarchitectureapplication.R

class AddBookFragment : Fragment() {

    companion object {
        fun newInstance() = AddBookFragment()
    }

    private lateinit var viewModel: AddBookViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_book, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this)[AddBookViewModel::class.java]

    }

}
