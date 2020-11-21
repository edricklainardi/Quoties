package id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.api

/*import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.ac.ui.cs.mobileprogramming.edricklainardi.quoties.R
import kotlinx.android.synthetic.main.item_qod.view.*

class QodAdapter (private val list: ArrayList<QodResponse>): RecyclerView.Adapter<QodAdapter.QodViewHolder>() {
    inner class QodViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(qodResponse: QodResponse){
            with(itemView){
                val text = "Quote: ${qodResponse.text}\n" +
                        "Author: ${qodResponse.author}"
                tvText.text = text
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_qod, parent, false)
        return QodViewHolder(view)
    }

    override fun onBindViewHolder(holder: QodViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}*/