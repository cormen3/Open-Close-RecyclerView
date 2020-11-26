package com.example.simplerecyclerview.view.adapter

import android.view.View
import com.example.simplerecyclerview.common.BaseHolder
import kotlinx.android.synthetic.main.list_item_type_1.view.*

class Model1ViewHolder(view: View) : BaseHolder<Model1>(view) {
    override fun bind(data: Model1?) {
        itemView.itemTitleType1.text = data?.text
    }
}