class Glass(width: Int) {
    var state: MutableList<CharArray> = mutableListOf<CharArray>()

    init {
        state.add(CharArray(width, { ' ' }))
    }

    fun drop(shape: String) {
        for (c in 0 until shape.length) {
            state[0][c] = shape[c]
        }
    }

    fun asString(): String {
        return state.joinToString {a-> a.joinToString ("")}
    }
}