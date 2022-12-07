package com.example.myfamily

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


//viewHolder is a user defined name
class MemberAdapter(private val listMembers: List<MemberModel>) : RecyclerView.Adapter<MemberAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberAdapter.ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        //item_member we created class of single card that we want to show in recyclerView
        val item = inflater.inflate(R.layout.item_member,parent,false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: MemberAdapter.ViewHolder, position: Int) {
        val item = listMembers[position]
        holder.name.text = item.name
    }

    override fun getItemCount(): Int {
        //return the size of members in our list
        return listMembers.size
    }

    class ViewHolder(private val item: View): RecyclerView.ViewHolder(item) {

        val imageUser = item.findViewById<ImageView>(R.id.img_user)
        val name = item.findViewById<TextView>(R.id.name)
    }

}