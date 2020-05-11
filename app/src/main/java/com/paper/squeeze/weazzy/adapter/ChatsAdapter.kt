package com.paper.squeeze.weazzy.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.paper.squeeze.weazzy.R

class ChatsAdapter : RecyclerView.Adapter<ChatsAdapter.ChatsViewHolder>() {

    class ChatsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatsViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(
            R.layout.chat_item,parent,false
        )
        return ChatsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(holder: ChatsViewHolder, position: Int) {

    }
}