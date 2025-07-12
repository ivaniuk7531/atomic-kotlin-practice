// Functions/Task3.kt
package functionsExercise3

fun duplicate(s: String): String {
  var text = ""

  repeat(2) {
    text += s
  }

  return text
}

fun main() {
  println(duplicate("abc"))  // abcabc
}