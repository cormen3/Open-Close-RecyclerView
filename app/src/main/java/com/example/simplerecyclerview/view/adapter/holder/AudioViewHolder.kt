package com.example.simplerecyclerview.view.adapter.holder

import android.view.View
import com.example.simplerecyclerview.model.Audio
import kotlinx.android.synthetic.main.audio_layout.view.*

/*
*   Created by Ehsan Abbasi on 11/4/2020
*/

class AudioViewHolder(private val view: View) : BaseViewHolder<Audio>(view) {
    override fun bind(model: Audio) {
        view.audioName.text = model.name
    }
}