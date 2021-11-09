package maxcoders.uz.quizapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.science_item_layout.view.*
import maxcoders.uz.quizapp.R
import maxcoders.uz.quizapp.model.ScienceModel

interface SciencesAdapterCallBack{
    fun onClick(item: ScienceModel)
}
class ScienceAdapter(val items: List<ScienceModel>, val callBack: SciencesAdapterCallBack):
    RecyclerView.Adapter<ScienceAdapter.ItemHolder>() {


    inner class ItemHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.science_item_layout, parent, false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val item = items[position]
        holder.itemView.setOnClickListener {
            callBack.onClick(item)
        }
        holder.itemView.tvTitle.text = item.title
    }

    override fun getItemCount(): Int {
       return items.count()
    }
}