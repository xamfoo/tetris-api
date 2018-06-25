package rest

import com.despegar.sparkjava.test.SparkServer
import org.junit.Assert.*
import org.junit.Test
import spark.servlet.SparkApplication

class ApiTestApplication: SparkApplication {
    override fun init() {
        main(arrayOf())
    }
}

val testServer: SparkServer<ApiTestApplication> = SparkServer(ApiTestApplication::class.java, 4567)

class ApiTests {
    @Test
    fun shouldGetProblem() {
        val getProblem = testServer.get("/problem", false)
        val response = testServer.execute(getProblem)
        assertEquals(200, response.code())
        assertEquals("""{"problemId":"1","shaft":{"nonEmptyLines":["* *"]},"nextShapes":[{"nonEmptyBlocks":["*"]}]}""", String(response.body()))
    }

    @Test
    fun shouldPostProblem() {
        val postSolution = testServer.post("/solution","""{"problemId":"1",}""", false)
        val response = testServer.execute(postSolution)
        assertEquals(200, response.code())
        assertEquals("""{"problemId":"1","shaft":{"nonEmptyLines":["***"]}}""", String(response.body()))
    }
}
