package com.example.simplerecyclerview.common

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter(
    vararg types: Tile<ListItem>
) : ListAdapter<ListItem, RecyclerView.ViewHolder>(BASE_DIFF_CALLBACK) {

    private val tileTypes: TileTypes<ListItem> = TileTypes(*types)

    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)
        return tileTypes.of(item).type()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return tileTypes.of(viewType).holder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = getItem(position)
        return tileTypes.of(item).bind(holder, item)
    }
}
