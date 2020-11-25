package com.example.simplerecyclerview.view.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.simplerecyclerview.R
import com.example.simplerecyclerview.model.*
import com.example.simplerecyclerview.view.adapter.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MainAdapter(
            listOf(
                Book("Book-01"),
                Movie("Movie-01"),
                Audio("Audio-01"),
                Book("Book-02"),
                Audio("Audio-02"),
                Audio("Audio-03"),
                Movie("Movie-02")
            ),
            listOf(MovieTile(), AudioTile(), BookTile())
        )
        mainRecyclerView.layoutManager =
            LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
        mainRecyclerView.adapter = adapter
    }
}