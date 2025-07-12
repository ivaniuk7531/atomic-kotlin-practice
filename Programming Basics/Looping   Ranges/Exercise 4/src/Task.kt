// LoopingAndRanges/Task4.kt
package loopingAndRangesExercise4

fun showHalfTriangle(n: Int) {
  for (i in 1..n) {
    repeat(i) {
      print("#")
    }
    print("\n")
  }
}

fun main() {
  showHalfTriangle(4)
}
/* Output:
#
##
###
####
*/