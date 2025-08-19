// Visibility/Task3.kt
package constrainingVisibilityExercise3

class Robot(
  private val fieldSize: Int,
  private var x: Int,
  private var y: Int
) {
  private fun crossBoundary(coordinate: Int): Int {
    val inBounds = coordinate % fieldSize
    return if (inBounds < 0) {
      fieldSize + inBounds
    } else {
      inBounds
    }
  }

  

  fun right(steps: Int) {
    val isValid = this.validateSteps(steps)

    if (isValid) {
      return
    }

    x += steps
  x = crossBoundary(x)
  }

  fun left(steps: Int) {
    val isValid = this.validateSteps(steps)

    if (isValid) {
      return
    }

    x -= steps
  x = crossBoundary(x)
  }

  fun down(steps: Int) {
    val isValid = this.validateSteps(steps)

    if (isValid) {
      return
    }

    y += steps
  y = crossBoundary(y)
  }

  fun up(steps: Int) {
    val isValid = this.validateSteps(steps)

    if (isValid) {
      return
    }

    y -= steps
  y = crossBoundary(y)
  }

  fun getLocation(): String = "($x, $y)"

  private fun validateSteps(steps: Int): Boolean {
    if (steps <= 0) {
      println("steps argument must be positive, is $steps")

      return false
    }

    return true
  }

  override fun toString() = "Robot(x=$x,y = $y)"
}

fun main() {
  val robot = Robot(10, 1, 1)
  robot.right(-1)
}
/* Output:
steps argument must be positive, is -1
*/