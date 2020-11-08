package com.example.simplerecyclerview.view.adapter.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView

/*
*   Created by Ehsan Abbasi on 11/4/2020
*/

abstract class BaseViewHolder<model : Any>(view: View) : RecyclerView.ViewHolder(view) {
    abstract fun bind(model: model)
}