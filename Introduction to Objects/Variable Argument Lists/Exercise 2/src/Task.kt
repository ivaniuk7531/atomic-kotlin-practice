// Varargs/Task2.kt
package variableArgumentListsExercise2

fun printArgs(prefix: String, vararg data: Int) {
    println("$prefix${data.joinToString(separator = ", ", prefix = "[", postfix = "]")}")
}

fun main() {
  printArgs("Numbers:", 1, 2, 3)
}
/* Expected output:
Numbers: [1, 2, 3]
 */