import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ShaftTests {
    @Test
    fun empty() {
        val glass = Shaft(width = 1)
        assertEquals(" ", glass.asString())
    }

    @Test
    fun width() {
        val glass = Shaft(width = 4)
        assertEquals("    ", glass.asString())
    }

    @Test
    fun drop() {
        val glass = Shaft(width = 1)
        glass.drop("*")
        assertEquals("*", glass.asString())
    }

    @Test
    fun drop2() {
        val glass = Shaft(width = 3)
        glass.drop("**")
        assertEquals("** ", glass.asString())
    }
}