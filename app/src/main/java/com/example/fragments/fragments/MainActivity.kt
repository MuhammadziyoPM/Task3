package com.example.fragments.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.fragments.R
import com.example.fragments.fragments.adapter.DataAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    lateinit var dataAdapter: DataAdapter
    lateinit var viewPager:ViewPager
    lateinit var tableLayout: TabLayout
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        tableLayout = findViewById(R.id.tabLayout_id)
        dataAdapter = DataAdapter(supportFragmentManager)
        viewPager = findViewById(R.id.viewPafer_id)


        dataAdapter.addFragment(BlankFragment(), "Friend Contacts")
        dataAdapter.addFragment(BlankFragment2(), "My Profile")

        viewPager.adapter = dataAdapter
        tableLayout.setupWithViewPager(viewPager)


    }


}