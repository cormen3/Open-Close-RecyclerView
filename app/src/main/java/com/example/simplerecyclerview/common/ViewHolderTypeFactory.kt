package com.example.simplerecyclerview.common

import android.view.ViewGroup
import com.example.simplerecyclerview.view.adapter.holder.BaseViewHolder

/*
*   Created by Ehsan Abbasi on 11/4/2020
*/

interface ViewHolderTypeFactory {
    fun type(item: MediaTile): MediaType
    fun create(view: ViewGroup, type: Int): BaseViewHolder<MediaTile>
}