// Properties/Task1.kt
package propertiesExercise1

class X () {
    var a = 3
    var b = 42
    var c = 0

    fun add (): Int {
        this.c = this.a + this.b

        return this.c
    }
}

fun main() {
  val x = X()

    println(x.add())
}