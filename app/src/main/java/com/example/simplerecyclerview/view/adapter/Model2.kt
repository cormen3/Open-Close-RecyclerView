package com.example.simplerecyclerview.view.adapter

import com.example.simplerecyclerview.R
import com.example.simplerecyclerview.common.BaseHolder
import com.example.simplerecyclerview.common.RecyclerModel

data class Model2(val text: String) : RecyclerModel {
    override val viewType: Int
        get() = R.layout.list_item_type_2

    override val viewHolderClass: Class<out BaseHolder<RecyclerModel>>
        get() = Model2ViewHolder::class.java
}