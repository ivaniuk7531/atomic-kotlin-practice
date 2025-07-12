// Summary1/Task8.kt
package summaryIExercise8

fun reverseDecimal(number: Int): Int {
  var worker = number
  var reversed = 0

  while (worker != 0) {
    val digit = worker % 10
    reversed = reversed * 10 + digit
    worker /= 10
  }

  return reversed
}

fun main() {
  println(reverseDecimal(1234))  // 4321
}