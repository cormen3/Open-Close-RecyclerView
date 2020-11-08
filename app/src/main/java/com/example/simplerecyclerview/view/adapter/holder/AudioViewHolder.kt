package com.example.simplerecyclerview.view.adapter.holder

import android.view.View
import com.example.simplerecyclerview.common.MediaTile
import com.example.simplerecyclerview.model.Audio
import kotlinx.android.synthetic.main.audio_layout.view.audioName

/*
*   Created by Ehsan Abbasi on 11/4/2020
*/

class AudioViewHolder(private val view: View) : BaseViewHolder<MediaTile>(view) {
    override fun bind(model: MediaTile) {
        val audio: Audio = model as Audio
        view.audioName.text = audio.name
    }
}