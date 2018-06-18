import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GlassTests {
    @Test
    fun empty() {
        val glass = Glass(width = 1)
        assertEquals(" ", glass.asString())
    }

    @Test
    fun width() {
        val glass = Glass(width = 4)
        assertEquals("    ", glass.asString())
    }

    @Test
    fun drop() {
        val glass = Glass(width = 1)
        glass.drop("*")
        assertEquals("*", glass.asString())
    }

    @Test
    fun drop2() {
        val glass = Glass(width = 3)
        glass.drop("**")
        assertEquals("** ", glass.asString())
    }
}