package rest

import com.google.gson.Gson
import spark.Service


fun main(args: Array<String>) {
    val http = spark.Service.ignite()
    val api = ApiController(http)
}


class ApiController(http: Service) {
    init {
        val problems = listOf(
                Problem(
                        "1",
                        ShaftState(listOf("* *")),
                        listOf(Shape(listOf("*")))
                ),
                Problem(
                        "2",
                        ShaftState(listOf("*  *")),
                        listOf(
                                Shape(listOf("*")),
                                Shape(listOf("*")))
                ))

        val gson = Gson()
        val toJson = { m: Any? -> gson.toJson(m) }
        with(http) {
            get("/") { req, res -> "hello, web!" }
            get("problem", { req, res -> problems[0] }, toJson)
            post("solution", {req, res -> SolutionResult("1", ShaftState(listOf("***"))) }, toJson)
        }
    }
}