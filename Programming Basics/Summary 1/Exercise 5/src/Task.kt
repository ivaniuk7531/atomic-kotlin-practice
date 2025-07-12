// Summary1/Task5.kt
package summaryIExercise5

fun everyFifth(start: Int, end: Int) {
  var count = 0
  for (i in start..end) {
    count++
    if (count % 5 == 0) {
      println(i)
    }
  }
}


fun main() {
  everyFifth(3, 14)
}
/* Output:
15
20
25
30
*/