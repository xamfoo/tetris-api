package model

class Shaft(val state: List<List<Block>>) {
    fun drop(shape: Shape): Shaft {
        return this
    }

    companion object {
        fun empty(width: Int, height: Int): Shaft {
            return Shaft((0 until height).map { (0 until width).map { Block.empty } })
        }
    }
}