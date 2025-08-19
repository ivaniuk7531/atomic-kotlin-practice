// Constructors/Task1.kt
package constructorsExercise1

class Floating(val d: Double) {
  override fun toString(): String = this.d.toString()
}

fun main() {
  val floating = Floating(2.9)
}