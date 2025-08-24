// NonNullAssertions/Task2.kt
package nonNullAssertionsExercise2
import atomictest.*

fun List<Int>.headPlusTail(): Triple<Int?, Int?, Int?> {
    if (this.isEmpty()) {
        return Triple(null, null, null)
    }

    if (this.size == 1) {
        return Triple(this.first(), null, null)
    }

    val firstEl = this.first()
    val lastEl = this.last()

    return Triple(firstEl, lastEl, firstEl * lastEl)
}


fun main() {
    val ints = mutableListOf<Int>()

    trace(ints.headPlusTail())

    for (n in -2..10) {
        ints.add(n)
    }

    trace(ints.headPlusTail())
}