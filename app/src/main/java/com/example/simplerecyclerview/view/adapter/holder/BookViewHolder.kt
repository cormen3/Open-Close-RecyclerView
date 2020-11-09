package com.example.simplerecyclerview.view.adapter.holder

import android.view.View
import com.example.simplerecyclerview.model.Book
import kotlinx.android.synthetic.main.book_layout.view.*

/*
*   Created by Ehsan Abbasi on 11/4/2020
*/

class BookViewHolder(private val view: View) : BaseViewHolder<Book>(view) {
    override fun bind(model: Book) {
        view.bookName.text = model.name
    }
}