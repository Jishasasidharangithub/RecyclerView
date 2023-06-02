package com.example.newsapp

import android.content.ClipData
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.databinding.ItemContentBinding

class NewsAdapter() : RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {
    private val dataItem = mutableListOf<NewsDetail>()

    inner class MyViewHolder(val binding: ItemContentBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemContentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        with(dataItem[position]){
            holder.binding.tvCaption.text=caption
            holder.binding.tvSubtitle.text=subtitle
            holder.binding.tvDescription.text=description
        }
    }
    fun updateList(list: List<NewsDetail>){
        dataItem.clear()
        dataItem.addAll(list)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return dataItem.size
    }
}