package com.example.simplerecyclerview.view.adapter.holder

import android.view.View
import com.example.simplerecyclerview.common.MediaTile
import com.example.simplerecyclerview.model.Movie
import kotlinx.android.synthetic.main.movie_layout.view.movieName

/*
*   Created by Ehsan Abbasi on 11/4/2020
*/

class MovieViewHolder(private val view: View) : BaseViewHolder<Movie>(view) {
    override fun bind(model: Movie) {
        view.movieName.text = model.name
    }
}