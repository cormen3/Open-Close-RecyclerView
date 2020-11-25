package com.example.simplerecyclerview.common

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter(vararg viewHolders: ViewHolderData) : RecyclerView.Adapter<BaseHolder>() {

    private var mModels: MutableList<RecyclerModel> = mutableListOf()
    private val viewHoldersMap = HashMap<Int, ViewHolderData>()
    private val viewTypesMap = HashMap<Class<out RecyclerModel>, Int>()

    init {
        viewHolders.iterator().forEach { viewHolder ->
            viewTypesMap[viewHolder.modelClass] = viewHolder.viewType
            viewHoldersMap[viewHolder.viewType] = viewHolder
        }
    }

    override fun getItemViewType(position: Int): Int {
        return viewTypesMap[mModels[position]::class.java]!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return viewHoldersMap[viewType]!!.viewHolderClass.getConstructor(View::class.java).newInstance(view)
    }

    override fun onBindViewHolder(holder: BaseHolder, position: Int) {
        holder.bind(mModels[position])
    }

    override fun getItemCount(): Int {
        return mModels.size
    }

    fun setList(list: List<RecyclerModel>) {
        mModels.clear()
        mModels.addAll(list)
        notifyDataSetChanged()
    }
}