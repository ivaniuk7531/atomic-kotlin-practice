// WhenExpressions/Task3.kt
package whenExpressionsExercise3
import atomictest.eq

fun balanced(input: String): Boolean {
  var counter = 0

  for (ch in input) {
    when (ch) {
      '(' -> counter++
      ')' -> {
        counter--
        if (counter < 0) {
          return false
        }
      }
      ' ' -> continue
      else -> throw IllegalArgumentException("Invalid character: $ch")
    }
  }

  return counter == 0
}

fun main() {
  balanced("(()) ()") eq true
  balanced(")(") eq false
}