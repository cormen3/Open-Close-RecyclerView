package com.example.simplerecyclerview.view.adapter

import android.view.ViewGroup
import com.example.simplerecyclerview.common.MediaTile
import com.example.simplerecyclerview.common.MediaType
import com.example.simplerecyclerview.common.ViewHolderTypeFactory
import com.example.simplerecyclerview.view.adapter.holder.BaseViewHolder

/*
*   Created by Ehsan Abbasi on 11/4/2020
*/

class ViewHolderFactoryImpl(
    private val models: List<MediaTile>
) : ViewHolderTypeFactory {

    override fun type(item: MediaTile): MediaType {
        return item.viewType()
    }

    override fun create(parent: ViewGroup, type: Int): BaseViewHolder<MediaTile> {
        models.filter { it.viewType().viewId == type }.first {
            return it.createViewHolder(parent)
        }
        throw Exception("What the hell :(")
    }
}