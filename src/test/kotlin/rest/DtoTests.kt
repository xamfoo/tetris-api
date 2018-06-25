package rest

import com.google.gson.Gson
import org.junit.Assert.assertEquals
import org.junit.Test

class DtoTests {
    @Test
    fun shouldSerializeSolution() {
        val solution = Solution("1", listOf(
                ShapeTransform(0, 1),
                ShapeTransform(0, 2)
        ))
        val gson = Gson()
        assertEquals("""{"problemId":"1","transforms":[{"clockwise90DegreeRotationCount":0,"rightShiftCount":1},{"clockwise90DegreeRotationCount":0,"rightShiftCount":2}]}""",
                gson.toJson(solution))
    }
}