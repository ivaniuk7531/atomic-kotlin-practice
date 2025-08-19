// Visibility/Task5.kt
package constrainingVisibilityExercise5

fun printSum(x: Int) {
  if (validateX(x)) return
  println((0..x).sum())
}

fun printAverage(x: Int) {
  if (validateX(x)) return
  println((0..x).average())
}

private fun validateX(x: Int): Boolean {
  if (x <= 0) {
    println("Incorrect input: $x should be positive")
    return true
  }
  return false
}

fun main() {
  printSum(-10)
  printAverage(-10)
}
/* Output:
Incorrect input: -10 should be positive
Incorrect input: -10 should be positive
*/