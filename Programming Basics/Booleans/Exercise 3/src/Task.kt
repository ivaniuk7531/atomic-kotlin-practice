// Booleans/Task3.kt
package booleansExercise3

fun and(first: Boolean, second: Boolean): Boolean {
  if (first) {
    if (second) {
      return true
    } else {
      return false
    }
  } else {
    return false
  }
}

fun or(first: Boolean, second: Boolean): Boolean {
  if (first) {
    return true
  } else {
    if (second) {
      return true
    } else {
      return false
    }
  }
}

fun main() {
  println(and(true, true)) // true
  println(or(true, false)) // true
}