// Properties/Task2.kt
package propertiesExercise2

class Robot {
  private var y = 0
  private var x = 0

  fun right(steps: Int) {
    this.x += steps
  }

  fun left(steps: Int) {
    this.x -= steps
  }

  fun down(steps: Int) {
    this.y += steps
  }

  fun up(steps: Int) {
    this.y -= steps
  }

  fun getLocation(): String = "($x, $y)"
}

fun main() {
  val robot = Robot()
  println(robot.getLocation())
  robot.right(1)
  println(robot.getLocation())
  robot.down(2)
  println(robot.getLocation())
}
/* Output:
(0, 0)
(1, 0)
(1, 2)
*/