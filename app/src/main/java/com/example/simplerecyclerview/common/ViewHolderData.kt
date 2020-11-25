package com.example.simplerecyclerview.common

data class ViewHolderData(
    val modelClass: Class<out RecyclerModel>,
    val viewType: Int,
    val viewHolderClass: Class<out BaseHolder>
)