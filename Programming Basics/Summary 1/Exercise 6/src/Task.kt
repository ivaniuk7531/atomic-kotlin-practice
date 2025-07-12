// Summary1/Task6.kt
package summaryIExercise6

fun everyFifthNonSpace(text: String) {
  var count = 0
  for (ch in text) {
    if (ch != ' ') {
      count++
      if (count % 5 == 0) {
        println("$ch")
      }
    }
  }
}

fun main() {
  everyFifthNonSpace("abc d e fgh ik")
}
/* Output:
e
k
*/