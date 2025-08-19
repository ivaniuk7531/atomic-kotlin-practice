// Summary2/Task1.kt
package summaryIIExercise1
import atomictest.eq
import atomictest.neq

class Boring() {
    fun a() = 1.618
    fun b() = "ratio"
    fun c() = 11
}

fun main() {
    val boring = Boring()

    boring.a() eq 1.618
    boring.b() eq "ratio"
    boring.c() eq 11

    boring.a() neq  1.2618
    boring.b() neq  "123ratio"
    boring.c() neq  12311
}