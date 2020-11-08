package com.example.simplerecyclerview.view.adapter.holder

import android.view.View
import com.example.simplerecyclerview.common.MediaTile
import com.example.simplerecyclerview.model.Book
import kotlinx.android.synthetic.main.book_layout.view.bookName

/*
*   Created by Ehsan Abbasi on 11/4/2020
*/

class BookViewHolder(private val view: View) : BaseViewHolder<MediaTile>(view) {
    override fun bind(model: MediaTile) {
        val book: Book = model as Book
        view.bookName.text = book.name
    }
}