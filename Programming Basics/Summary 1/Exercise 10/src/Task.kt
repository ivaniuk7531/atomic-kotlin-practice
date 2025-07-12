// Summary1/Task10.kt
package summaryIExercise10

fun showSnake(rows: Int, columns: Int) {
  val maxNumber = rows * columns - 1
  val width = maxNumber.toString().length + 1
  var number = 0

  for (row in 0 until rows) {
    val line = Array(columns) { "" }
    if (row % 2 == 0) {
      for (col in 0 until columns) {
        line[col] = "%${width}d".format(number++)
      }
    } else {
      for (col in columns - 1 downTo 0) {
        line[col] = "%${width}d".format(number++)
      }
    }
    println(line.joinToString(""))
  }
}


fun main() {
  showSnake(2, 2)
//  println()
//  showSnake(4, 5)
}
/* Output:
 0 1 2
 5 4 3

  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15
*/