package com.example.simplerecyclerview.common

class TileTypes<T>(vararg types: Tile<T>) {
    private val tileTypes: ArrayList<Tile<T>> = ArrayList()

    init {
        types.forEach { addType(it) }
    }

    private fun addType(type: Tile<T>) {
        tileTypes.add(type)
    }

    fun of(item: T?): Tile<T> {
        for (cellType in tileTypes) {
            if (cellType.isTypeOf(item)) return cellType
        }
        throw NoSuchItemTypeException()
    }

    fun of(viewType: Int): Tile<T> {
        for (cellType in tileTypes) {
            if (cellType.type() == viewType) return cellType
        }
        throw NoSuchViewTypeException()
    }
}