package com.example.simplerecyclerview.view.adapter

import android.view.View
import com.example.simplerecyclerview.common.BaseHolder
import kotlinx.android.synthetic.main.list_item_type_2.view.*

class Model2ViewHolder(view: View) : BaseHolder<Model2>(view) {
    override fun bind(data: Model2?) {
        itemView.itemTitleType2.text = data?.text
    }
}