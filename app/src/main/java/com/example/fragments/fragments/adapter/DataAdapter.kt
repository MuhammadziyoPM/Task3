package com.example.fragments.fragments.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class DataAdapter(
    fm:FragmentManager ,
   ):FragmentStatePagerAdapter(fm) {

    val fragmentList= ArrayList<Fragment> ()
    var dataList=ArrayList<String>()

    fun addFragment(fragments: Fragment , data: String){
        fragmentList.add(fragments)
        dataList.add(data)
    }
    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return dataList[position]
    }


}