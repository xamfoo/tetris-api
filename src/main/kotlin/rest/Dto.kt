package rest

data class ShaftState(val nonEmptyLines: List<String>)
data class Shape(val nonEmptyBlocks: List<String>)
data class Problem(val problemId: String, val shaft: ShaftState, val nextShapes: List<Shape>)
data class ShapeTransform(val clockwise90DegreeRotationCount: Int, val rightShiftCount: Int)
data class Solution(val problemId: String, val transforms: List<ShapeTransform>)
data class SolutionResult(var problemId: String, val shaft: ShaftState)