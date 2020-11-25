package com.example.simplerecyclerview.view.adapter

import com.example.simplerecyclerview.R
import com.example.simplerecyclerview.common.BaseAdapter
import com.example.simplerecyclerview.common.ViewHolderData

class MainAdapter : BaseAdapter(
    ViewHolderData(
        Model1::class.java,
        R.layout.list_item_type_1,
        Model1ViewHolder::class.java
    ),
    ViewHolderData(
        Model2::class.java,
        R.layout.list_item_type_2,
        Model2ViewHolder::class.java
    )
)