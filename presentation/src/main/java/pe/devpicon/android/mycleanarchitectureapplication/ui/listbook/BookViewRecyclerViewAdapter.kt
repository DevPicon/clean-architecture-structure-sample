package pe.devpicon.android.mycleanarchitectureapplication.ui.listbook

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pe.devpicon.android.mycleanarchitectureapplication.databinding.ItemBookBinding

/**
 * [RecyclerView.Adapter] that can display a [BookView].
 * TODO: Replace the implementation with code for your data type.
 */
class BookViewRecyclerViewAdapter(
    private val values: List<BookView>
) : RecyclerView.Adapter<BookViewRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            ItemBookBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: ItemBookBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private val bookTitleView: TextView = binding.tvBookTitle
        private val bookAuthorView: TextView = binding.tvBookAuthor

        override fun toString(): String {
            return super.toString() + " '" + bookAuthorView.text + "'"
        }

        fun bind(item: BookView) {
            bookAuthorView.text = item.author
            bookTitleView.text = item.title
        }
    }

}
