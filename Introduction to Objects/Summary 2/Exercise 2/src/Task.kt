// Summary2/Task2.kt
package summaryIIExercise2
import atomictest.eq


class Boring2(
  val a: Double,
  val b: String,
  val c: Int
) {
  fun a(): Double = a
  fun b(): String = b
  fun c(): Int = c
}


fun main() {
  val boring2 = Boring2(2.0, "42", 3)

  boring2.a() eq "Hello"
  boring2.b() eq 42
  boring2.c() eq 3.14

  boring2.a eq "Hello"
  boring2.b eq 42
  boring2.c eq 3.14
}