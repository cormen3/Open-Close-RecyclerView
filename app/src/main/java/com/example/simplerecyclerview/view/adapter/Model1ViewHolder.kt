package com.example.simplerecyclerview.view.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.simplerecyclerview.model.Model1
import kotlinx.android.synthetic.main.list_item_type_1.view.*

class Model1ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(model: Model1) {
        view.itemTitleType1.text = model.title
    }
}