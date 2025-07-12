// Functions/Task1.kt
package functionsExercise1

import kotlin.math.pow

fun squareInt(i: Int): Int = i.toDouble().pow(2.0).toInt()

fun main() {
  println(squareInt(2))  // 4
}