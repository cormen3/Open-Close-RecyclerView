package com.example.simplerecyclerview.view.adapter

import com.example.simplerecyclerview.R
import com.example.simplerecyclerview.common.BaseHolder
import com.example.simplerecyclerview.common.RecyclerModel

data class Model1(val text: String) : RecyclerModel {
    override val viewType: Int
        get() = R.layout.list_item_type_1

    override val viewHolderClass: Class<out BaseHolder<RecyclerModel>>
        get() = Model1ViewHolder::class.java
}