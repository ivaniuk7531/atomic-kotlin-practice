// Summary1/Task9.kt
package summaryIExercise9

fun printTriangle(n: Int) {
  for (i in 1..n) {
    val spaces = n - i
    val hashes = 2 * i - 1

    repeat(spaces) { print(" ") }
    repeat(hashes) { print("#") }
    println()
  }
}

fun main() {
  printTriangle(4)
}
/* Output:
   #
  ###
 #####
#######
*/