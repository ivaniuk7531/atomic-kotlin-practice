// Summary2/Task8.kt
package summaryIIExercise8
import atomictest.eq

val romanToIntMap: Map<Char, Int> = mapOf(
  'I' to 1,
  'V' to 5,
  'X' to 10,
  'L' to 50,
  'C' to 100,
  'D' to 500,
  'M' to 1000
)

fun convertFromRoman(roman: String): Int {
  var result = 0
  var i = 0

  while (i < roman.length) {
    val currentValue = romanToIntMap[roman[i]] ?: 0

    if (i + 1 < roman.length) {
      val nextValue = romanToIntMap[roman[i + 1]] ?: 0

      if (currentValue < nextValue) {
        result += (nextValue - currentValue)
        i += 2
      } else {
        result += currentValue
        i += 1
      }
    } else {
      result += currentValue
      i += 1
    }
  }

  return result
}

fun main() {
  convertFromRoman("XXIII") eq 23
  convertFromRoman("XLIV") eq 44
  convertFromRoman("C") eq 100
  convertFromRoman("MMXVIII") eq 2018
}