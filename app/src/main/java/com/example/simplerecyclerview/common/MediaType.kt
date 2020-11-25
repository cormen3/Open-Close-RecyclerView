package com.example.simplerecyclerview.common

import com.example.simplerecyclerview.R

/*
*   Created by Ehsan Abbasi on 11/4/2020
*/

enum class MediaType(val viewId:Int) {
    MOVIE(R.layout.movie_layout),
    AUDIO(R.layout.audio_layout),
    BOOK(R.layout.book_layout);
}