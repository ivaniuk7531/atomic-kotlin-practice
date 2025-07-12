// RepetitionWithWhile/Task3.kt
package repetitionWithWhileExercise3

fun sumOfEven(n: Int): Int {
  var index = 0
  var sum = 0

  while (index <= n) {
    if (index % 2 == 0) {
      sum += index
    }
    index++
  }

  return sum
}

fun main() {
  println(sumOfEven(10))  // 30
}