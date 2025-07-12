// Summary1/Task2.kt
package summaryIExercise2

fun other(text: String): String {
  var result = ""
  for (i in text.indices step 2) {
    result += text[i]
  }
  return result
}


fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/