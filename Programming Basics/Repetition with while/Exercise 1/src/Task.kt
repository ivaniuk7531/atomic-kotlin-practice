// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(someString: String) {
    var index = 0

    while (index < someString.length) {
        println(someString[index])
        index++
    }
}

fun main() {
  displayContent("abc")
}
/* Expected output:
a
b
c
*/