package com.example.simplerecyclerview.common

interface RecyclerModel {
    val viewType: Int
    val viewHolderClass: Class<out BaseHolder<RecyclerModel>>
}