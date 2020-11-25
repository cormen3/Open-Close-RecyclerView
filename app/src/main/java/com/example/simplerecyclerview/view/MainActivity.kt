package com.example.simplerecyclerview.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.simplerecyclerview.R
import com.example.simplerecyclerview.view.adapter.MainAdapter
import com.example.simplerecyclerview.view.adapter.Model1
import com.example.simplerecyclerview.view.adapter.Model2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MainAdapter().apply {
            setList(listOf(Model1("FirstType1Item"), Model2("FirstType2Item")))
        }
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView.adapter = adapter
    }
}