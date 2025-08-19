// Summary2/Task3.kt
package summaryIIExercise3
import atomictest.*

class FixedSizeHolder(private val maxSize: Int) {

    private val items = mutableListOf<Any>()

    val size: Int
        get() = items.size

    val full: Boolean
        get() = items.size >= maxSize

    fun add(item: Any) {
        if (full) {
            throw IllegalStateException("The container is full")
        }
        items.add(item)
    }
}

fun main() {
  val holder = FixedSizeHolder(2)
  holder.add("What is the answer?")
  holder.add(42)
  holder.full eq true
  holder.size eq 2
  capture {
    holder.add("!!!")
  } eq "IllegalStateException: The container is full"
}