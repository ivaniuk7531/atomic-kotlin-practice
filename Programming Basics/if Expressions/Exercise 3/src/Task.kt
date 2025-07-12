// IfExpressions/Task3.kt
package ifExpressionsExercise3

import kotlin.math.max

fun findMax(first: Int, second: Int): Int = if (first > second) first else second

fun main() {
  println(findMax(-1, 4))  // 4
}