// Testing/Task3.kt
package testingExercise3
import atomictest.eq

fun squareArea(x: Int) = x * x

fun rectangleArea(x: Int, y: Int) = x * y

fun trapezoidArea(x: Int, y: Int, h: Int) = (h * (x + y)) / 2.0

fun quadrangleArea(x1: Int, y1: Int, x2: Int, y2: Int, x3: Int, y3: Int, x4: Int, y4: Int): Double {
  val area = 0.5 * kotlin.math.abs(
    (x1 * y2 - x2 * y1) +
            (x2 * y3 - x3 * y2) +
            (x3 * y4 - x4 * y3) +
            (x4 * y1 - x1 * y4)
  )
  return area
}

fun main() {
  squareArea(1) eq 1
  squareArea(2) eq 4
  squareArea(5) eq 25

  rectangleArea(2, 3) eq 6
  rectangleArea(4, 5) eq 20
  rectangleArea(1, 10) eq 10

  trapezoidArea(3, 7, 4) eq 20
  trapezoidArea(5, 5, 6) eq 30
  trapezoidArea(2, 8, 3) eq 15

  quadrangleArea(0, 0, 4, 0, 4, 3, 0, 3) eq 12.0
  quadrangleArea(0, 0, 3, 0, 3, 4, 0, 4) eq 12.0
  quadrangleArea(1, 0, 3, 2, 1, 4, -1, 2) eq 8.0
  quadrangleArea(0, 0, 1, 0, 1, 1, 0, 1) eq 1.0
  quadrangleArea(0, 0, 4, 0, 6, 3, 2, 3) eq 12.0
  quadrangleArea(0, 0, 2, 1, 3, 3, 1, 2) eq 4.0
}