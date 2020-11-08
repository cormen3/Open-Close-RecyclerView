package com.example.simplerecyclerview.view.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.simplerecyclerview.common.MediaTile
import com.example.simplerecyclerview.view.adapter.holder.BaseViewHolder

/*
*   Created by Ehsan Abbasi on 11/8/2020
*/

class MainAdapter constructor(
    private val items: List<MediaTile>,
    private val models: List<MediaTile>
) : RecyclerView.Adapter<BaseViewHolder<MediaTile>>() {
    private val viewHolderTypeFactory = ViewHolderFactoryImpl(models)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<MediaTile> {
        return viewHolderTypeFactory.create(parent, viewType)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<MediaTile>, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return viewHolderTypeFactory.type(items[position]).viewId
    }
}