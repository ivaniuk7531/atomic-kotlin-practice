// StringTemplates/Task1.kt
package stringTemplatesExercise1

fun findMax(first: Int, second: Int): Int =
  if (first > second) first else second

fun main() {
  val first = 17
  val second = 31

  println("The maximum of $first and $second is ${findMax(first, second)}.")
}