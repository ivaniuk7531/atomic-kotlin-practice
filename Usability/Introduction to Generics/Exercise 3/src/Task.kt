// IntroGenerics/Task3.kt
package introductionToGenericsExercise3

import atomictest.eq

class CountingSet<T>{
    private val map = mutableMapOf<T, Int>()

    fun add (element: T) {
        if(map.contains(element)) {
            map[element] = map[element]!! + 1
            return
        }

        map[element] = 1
    }

    fun count (element: T): Int = map[element] ?: 0

    fun toSet () = map.keys.toSet()
}

fun main() {
  val cs = CountingSet<String>()
  cs.add("abc")
  cs.add("abc")
  cs.add("def")
  cs.count("abc") eq 2
  cs.count("def") eq 1
  cs.count("xyz") eq 0
}