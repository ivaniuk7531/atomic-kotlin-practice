// NamedAndDefaultArgs/Task1.kt
package namedAndDefaultArgumentsExercise1

class Rectangle(
  val side1: Double = 1.0,
  val side2: Double = 2.0,
  val color: String = "yellow"
) {
  override fun toString(): String {
    return "$color rectangle $side1 x $side2"
  }
}

fun main() {
  println("Different ways to call the Rectangle constructor:")
  println()

  val rect1 = Rectangle()
  println("1. All defaults: $rect1")

  val rect2 = Rectangle(3.5)
  println("2. Only side1: $rect2")

  val rect3 = Rectangle(4.0, 6.0)
  println("3. side1 and side2: $rect3")

  val rect4 = Rectangle(5.0, 7.5, "blue")
  println("4. All parameters: $rect4")

  val rect5 = Rectangle(color = "red", side1 = 3.0)
  println("5. Named parameters: $rect5")

  val rect6 = Rectangle(side2 = 8.0, color = "green")
  println("6. Named parameters (side2 + color): $rect6")

  val rect7 = Rectangle(2.5, color = "purple")
  println("7. Mixed positional/named: $rect7")

  val rect8 = Rectangle(color = "orange", side2 = 4.5, side1 = 1.5)
  println("8. All named (reordered): $rect8")
}