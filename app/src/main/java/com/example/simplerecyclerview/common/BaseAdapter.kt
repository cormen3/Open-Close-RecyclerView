package com.example.simplerecyclerview.common

import android.util.SparseArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter : RecyclerView.Adapter<BaseHolder<RecyclerModel>>() {

    private var mItems: MutableList<RecyclerModel> = mutableListOf()
    private val supportedViewHolder = SparseArray<Class<out BaseHolder<RecyclerModel>>>()

    override fun getItemViewType(position: Int): Int {
        val item = mItems[position]
        val viewType = item.viewType
        if (supportedViewHolder.indexOfKey(viewType) < 0) {
            supportedViewHolder.put(viewType, item.viewHolderClass)
        }

        return viewType
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHolder<RecyclerModel> {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return supportedViewHolder[viewType]!!.getConstructor(View::class.java).newInstance(view)
    }

    override fun onBindViewHolder(holder: BaseHolder<RecyclerModel>, position: Int) {
        holder.bind(mItems[position])
    }

    override fun getItemCount(): Int {
        return mItems.size
    }

    fun setList(list: List<RecyclerModel>) {
        mItems.clear()
        mItems.addAll(list)
        notifyDataSetChanged()
    }
    
}