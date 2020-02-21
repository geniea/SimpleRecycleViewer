package com.example.recycleviewer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val data: ArrayList<MyData>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>(){

   // private val data = arrayListOf<MyData>()

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.textId.text = item.id.toString()
        holder.textName.text = item.name

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)

    }


    class ViewHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textId: TextView = itemView.findViewById(R.id.textView_id)
        val textName: TextView = itemView.findViewById(R.id.textView_name)

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater
                    .inflate(R.layout.view_item, parent, false)

                return ViewHolder(view)
            }
        }

    }

}