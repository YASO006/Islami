package RecyclerView.QuranList

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R

class MyAdapter(var resource : Int , var data : ArrayList<SurahListContents>,var onClickItem : (SurahListContents) -> Unit) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(resource,parent,false)

        var holder = ViewHolder(view)

        return holder

    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.surahName.setText(data.get(position).surahName)

        holder.versesCount.setText(data.get(position).versesCount)

        holder.surahNameInArabic.setText(data.get(position).surahNameInArabic)

        holder.surahNumber.setText(data.get(position).SurahNumber)

        holder.itemView.setOnClickListener {

            onClickItem(data.get(position))

        }

    }

    override fun getItemCount(): Int {
        return data.size
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var surahName = itemView.findViewById<TextView>(R.id.surahName)
        var versesCount = itemView.findViewById<TextView>(R.id.versesCount)
        var surahNameInArabic = itemView.findViewById<TextView>(R.id.surahNameInArabic)

        var surahNumber = itemView.findViewById<TextView>(R.id.surahNumber)

    }
}