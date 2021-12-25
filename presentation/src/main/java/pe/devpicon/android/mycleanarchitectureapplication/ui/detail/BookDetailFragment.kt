package pe.devpicon.android.mycleanarchitectureapplication.ui.detail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pe.devpicon.android.mycleanarchitectureapplication.R

class BookDetailFragment : Fragment() {

    companion object {
        fun newInstance() = BookDetailFragment()
    }

    private lateinit var viewModel: BookDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_book_detail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BookDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
