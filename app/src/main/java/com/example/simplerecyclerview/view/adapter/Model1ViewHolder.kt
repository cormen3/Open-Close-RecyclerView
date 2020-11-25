package com.example.simplerecyclerview.view.adapter

import android.view.View
import com.example.simplerecyclerview.common.BaseHolder
import com.example.simplerecyclerview.common.RecyclerModel
import kotlinx.android.synthetic.main.list_item_type_1.view.*

class Model1ViewHolder(view: View) : BaseHolder(view) {
    override fun bind(data: RecyclerModel?) {
        itemView.itemTitleType1.text = (data as Model1).text
    }
}