// Exceptions/Task2.kt
package exceptionsExercise2
import atomictest.capture
import atomictest.eq

fun abort(s: String): Nothing = throw Exception(s)

fun main() {
  capture {
    abort("Stop!")
  } eq "Exception: Stop!"
}