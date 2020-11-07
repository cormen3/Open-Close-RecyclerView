package com.example.simplerecyclerview.common

interface ListItem {
    val id: String?
    override fun equals(other: Any?): Boolean
}