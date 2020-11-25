package com.example.simplerecyclerview.common

import android.view.ViewGroup
import com.example.simplerecyclerview.view.adapter.holder.BaseViewHolder

/*
*   Created by Ehsan Abbasi on 11/8/2020
*/

interface MediaTile {
    fun viewType(): MediaType
    fun createViewHolder(parent: ViewGroup): BaseViewHolder<MediaTile>
}