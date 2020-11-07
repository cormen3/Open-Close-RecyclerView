package com.example.simplerecyclerview.common

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView

abstract class Tile<T> {
    abstract fun isTypeOf(item: T?): Boolean
    abstract fun type(): Int
    abstract fun holder(parent: ViewGroup): RecyclerView.ViewHolder
    abstract fun bind(holder: RecyclerView.ViewHolder, item: T?)

    protected fun ViewGroup.viewOf(@LayoutRes resource: Int): View {
        return LayoutInflater.from(context).inflate(resource, this, false)
    }
}