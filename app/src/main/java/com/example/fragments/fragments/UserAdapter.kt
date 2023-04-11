package com.example.fragments.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragments.R
import com.google.android.material.imageview.ShapeableImageView

class UserAdapter(var list:ArrayList<User>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user:User = list[position]
        if(holder is UserViewHolder){
            holder.profile_image.setImageResource(user.image)
            holder.username.text = user.username
            holder.message.text = user.message
        }
    }
    inner class UserViewHolder(view: View):RecyclerView.ViewHolder(view){
        val profile_image:ShapeableImageView = view.findViewById(R.id.profile_image)
        val username:TextView = view.findViewById(R.id.username)
        var message:TextView = view.findViewById(R.id.message)
    }


}