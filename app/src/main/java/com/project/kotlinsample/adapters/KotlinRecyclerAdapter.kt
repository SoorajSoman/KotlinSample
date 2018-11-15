package com.project.kotlinsample.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.project.kotlinsample.R
import com.project.kotlinsample.model.User
import java.util.List

class KotlinRecyclerAdapter(val items: ArrayList<User>) : RecyclerView.Adapter<KotlinRecyclerAdapter.KotlinViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): KotlinRecyclerAdapter.KotlinViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return KotlinViewHolder(v)
    }

    override fun onBindViewHolder(holder: KotlinRecyclerAdapter.KotlinViewHolder, position: Int) {
        holder.bindItems(items[position])
    }

    override fun getItemCount(): Int {
        if (items == null) {
            return 0
        }
        return items.size
    }

    class KotlinViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(user: User) {
            val textViewName = itemView.findViewById(R.id.name) as TextView
            val textViewAddress  = itemView.findViewById(R.id.email) as TextView
            textViewName.text = user.name
            textViewAddress.text = user.email
        }
    }
}