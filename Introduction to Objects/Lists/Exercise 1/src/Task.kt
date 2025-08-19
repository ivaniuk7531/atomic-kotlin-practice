// Lists/Task1.kt
package listsExercise1
import atomictest.eq

fun findMax(list: IntList): Int {
  if (list.size() == 0) {
    return 0
  }

  val maxEl = list.maxOrNull() ?: return 0

  return  maxEl
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  findMax(list) eq 3
}