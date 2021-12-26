package pe.devpicon.android.mycleanarchitectureapplication.ui.listbook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import pe.devpicon.android.mycleanarchitectureapplication.R
import pe.devpicon.android.mycleanarchitectureapplication.application.BookApplication
import pe.devpicon.android.mycleanarchitectureapplication.ui.MainViewModelFactory
import javax.inject.Inject

/**
 * A fragment representing a list of Items.
 */
@AndroidEntryPoint
class ListBookFragment : Fragment() {

    private val listBookViewModel: ListBookViewModel by viewModels()
    /*by viewModels {
        MainViewModelFactory((requireActivity().application as BookApplication).applicationContainer)
    }*/
    private val bookAdapter: BookViewRecyclerViewAdapter by lazy {
        BookViewRecyclerViewAdapter(listOf())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list_book, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = LinearLayoutManager(context)
                adapter = bookAdapter
            }
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listBookViewModel.bookViewList.observe(viewLifecycleOwner, {
            bookAdapter.updateList(it)
        })
    }

    companion object {


        // TODO: Customize parameter initialization
        @JvmStatic
        fun newInstance(columnCount: Int) =
            ListBookFragment().apply {
                arguments = Bundle()
            }
    }
}
