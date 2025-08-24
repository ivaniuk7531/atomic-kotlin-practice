// NullableExtensions/Task2.kt
package extensionsForNullableTypesExercise2
import atomictest.eq

fun Boolean?.and(other: Boolean?): Boolean? =
  if (this == null || other == null) {
    null
  } else {
    this && other
  }


fun Boolean?.or(that: Boolean?): Boolean? =
  if (this == null || that == null) {
    null
  } else {
    this || that
  }

fun main() {
  val b = true
  b.and(null) eq null
  null.or(b) eq null
  b.or(false) eq true
}