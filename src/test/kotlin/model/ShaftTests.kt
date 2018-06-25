import model.Block
import model.Shaft
import model.Shape
import org.junit.Assert.assertEquals
import org.junit.Test

class ShaftTests {

    fun shaftFromString(blocks: String): Shaft {
        return Shaft(blocks.split('\n').map {
            it.map {
                when (it) {
                    ' ' -> Block.empty
                    else -> Block.filled
                }
            }
        })
    }

    fun shapeFromString(blocks: String): Shape {
        return Shape(blocks.split('\n').map {
            it.map {
                when (it) {
                    ' ' -> Block.empty
                    else -> Block.filled
                }
            }
        })
    }


    @Test
    fun empty() {
        val shaft = Shaft.empty(1, 1)
        assertEquals(" ", shaft.asString())
    }

    @Test
    fun largerEmpty() {
        val shaft = Shaft.empty(3, 2)
        assertEquals("   \n   ", shaft.asString())
    }

    @Test
    fun drop() {
        var shaft = Shaft.empty(1, 1)
        shaft = shaft.drop(shapeFromString("*"))
        assertEquals("*", shaft.asString())
    }

    @Test
    fun drop2() {
        var shaft = Shaft.empty(3, 2)
        shaft = shaft.drop(shapeFromString("**"))
        assertEquals("   \n** ", shaft.asString())
    }
}

private fun Shaft.asString(): String {
    return state.joinToString("\n") { it.joinToString("") { if (it.isEmpty) " " else "*" } }
}
