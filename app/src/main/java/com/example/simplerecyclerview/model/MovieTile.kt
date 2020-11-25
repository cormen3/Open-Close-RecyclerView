package com.example.simplerecyclerview.model

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.simplerecyclerview.common.MediaTile
import com.example.simplerecyclerview.common.MediaType
import com.example.simplerecyclerview.view.adapter.holder.BaseViewHolder
import com.example.simplerecyclerview.view.adapter.holder.MovieViewHolder

/*
*   Created by Ehsan Abbasi on 11/8/2020
*/

open class MovieTile : MediaTile {
    override fun viewType(): MediaType = MediaType.MOVIE

    override fun createViewHolder(parent: ViewGroup): BaseViewHolder<MediaTile> {
        val view = LayoutInflater.from(parent.context).inflate(MediaType.MOVIE.viewId, parent, false)
        return MovieViewHolder(view)
    }

}