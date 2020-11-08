package com.example.simplerecyclerview.model

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.simplerecyclerview.common.MediaTile
import com.example.simplerecyclerview.common.MediaType
import com.example.simplerecyclerview.view.adapter.holder.AudioViewHolder
import com.example.simplerecyclerview.view.adapter.holder.BaseViewHolder

/*
*   Created by Ehsan Abbasi on 11/8/2020
*/

open class AudioTile : MediaTile {
    override fun viewType(): MediaType = MediaType.AUDIO

    override fun createViewHolder(parent: ViewGroup): BaseViewHolder<MediaTile> {
        val view =
            LayoutInflater.from(parent.context).inflate(MediaType.AUDIO.viewId, parent, false)
        return AudioViewHolder(view)
    }
}