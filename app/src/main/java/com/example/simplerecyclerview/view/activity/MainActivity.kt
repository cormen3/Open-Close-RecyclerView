package com.example.simplerecyclerview.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.simplerecyclerview.R
import com.example.simplerecyclerview.view.adapter.MainAdapter
import com.example.simplerecyclerview.model.Model1
import com.example.simplerecyclerview.model.Model2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MainAdapter()
        adapter.submitList(listOf(
            Model1("ali"), Model2("hassan"),
            Model1("hossein")
        ))
        mainRecyclerView.layoutManager = LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
        mainRecyclerView.adapter = adapter
    }
}