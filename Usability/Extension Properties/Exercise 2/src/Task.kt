// ExtensionProperties/Task2.kt
package extensionPropertiesExercise2
import atomictest.eq

val <T> List<T>.reversed : List<T>
    get() {
        val list = mutableListOf<T>()

        for (el in this.size - 1 downTo 0) {
            list.add(this[el])
        }

        return list.toList()
    }

fun main() {
    val list = listOf(1, 2, 3)
    list.reversed eq listOf(3, 2, 1)
}