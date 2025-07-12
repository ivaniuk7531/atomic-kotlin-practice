// InKeyword/Task4.kt
package theInKeywordExercise4

// isValidCharacter

fun isValidIdentifier(name: String): Boolean {
  if (name.isEmpty()) return false

  val firstChar = name[0]

  if (!(firstChar.isLetter() || firstChar == '_')) return false

  for (char in name) {
    if (!(char.isLetterOrDigit() || char == '_')) return false
  }

  return true
}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}