// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
  var sum = 0
  var index = 0

  while (index in 0..number) {
    sum += index
    index++
  }

  return sum
}

fun main() {
  println(sum(10))  // 55
}