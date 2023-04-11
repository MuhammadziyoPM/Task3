package com.example.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragments.R

class BlankFragment : Fragment() {

lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {


        recyclerView = view.findViewById(R.id.recyclerView_id)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        refreshAdapter(data())
    }

    private fun data(): ArrayList<User> {
      val list = ArrayList<User>()
        list.add(User(R.drawable.gates , "Bill Gates" , "Will you sell this program for me . I will buy it !"))
        list.add(User(R.drawable.jeff , "Jeff Bezos" , "Shou should try to create a new Facebook , young developer !"))
        list.add(User(R.drawable.stiv , "Stiv Jobs" , "It is a good project for 'Apple Company' !"))
        list.add(User(R.drawable.gates , "Bill Gates" , "Will you sell this program for me . I will buy it !"))
        list.add(User(R.drawable.jeff , "Jeff Bezos" , "Shou should try to create a new Facebook , young developer !"))
        list.add(User(R.drawable.stiv , "Stiv Jobs" , "It is a good project for 'Apple Company' !"))
        list.add(User(R.drawable.gates , "Bill Gates" , "Will you sell this program for me . I will buy it !"))
        list.add(User(R.drawable.jeff , "Jeff Bezos" , "Shou should try to create a new Facebook , young developer !"))
        list.add(User(R.drawable.stiv , "Stiv Jobs" , "It is a good project for 'Apple Company' !"))
        list.add(User(R.drawable.gates , "Bill Gates" , "Will you sell this program for me . I will buy it !"))
        return list
    }
    private fun refreshAdapter(user: ArrayList<User>) {
    val adapter = UserAdapter(user)
    recyclerView.adapter = adapter
}


}
