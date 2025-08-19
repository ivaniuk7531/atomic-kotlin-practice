// Sets/Task2.kt
package setsExercise2
import kotlin.random.Random

fun experiment(): Int {
  val targetSet = mutableSetOf<Int>()
  var count = 0

  while (targetSet.size < 25) {
    val randomNumber = Random.nextInt(25) + 1
    targetSet.add(randomNumber)
    count++
  }

  return count
}
fun main() {
  val counts = mutableListOf<Int>()

  repeat(1000) {
    val randomNumber = experiment()

    counts += randomNumber
  }
  println(counts.average())
}