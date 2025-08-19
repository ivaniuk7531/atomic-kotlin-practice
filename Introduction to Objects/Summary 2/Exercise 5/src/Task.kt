// Summary2/Task5.kt
package summaryIIExercise5

fun va1(vararg list: Int) {
    println("va1:")

    for (el in list) {
        println(el)
    }
}

fun va2(vararg list: Int) {
    println("va2:")
    va1(*list)
}

fun main() {
  va1(1, 2, 3)
  va2(4, 5, 6)
}
/* Expected output:
va1:
1
2
3
va2:
va1:
4
5
6
 */