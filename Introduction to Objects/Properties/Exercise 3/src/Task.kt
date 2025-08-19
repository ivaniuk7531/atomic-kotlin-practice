// Properties/Task3.kt
package propertiesExercise3
class Robot {
  var x = 0
  var y = 0
  private val fieldSize = 100

  fun right(steps: Int) {
    x = (x + steps) % fieldSize
  }

  fun left(steps: Int) {
    x = ((x - steps) % fieldSize + fieldSize) % fieldSize
  }

  fun down(steps: Int) {
    y = (y + steps) % fieldSize
  }

  fun up(steps: Int) {
    y = ((y - steps) % fieldSize + fieldSize) % fieldSize
  }

  fun getLocation(): String = "($x, $y)"
}

fun main() {
  val robot = Robot()
  println(robot.getLocation())
  robot.up(1)
  println(robot.getLocation())
  robot.left(130)
  println(robot.getLocation())
}
/* Output:
(0, 0)
(0, 99)
(90, 99)
*/