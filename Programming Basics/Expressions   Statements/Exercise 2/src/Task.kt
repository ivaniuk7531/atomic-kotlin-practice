// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2


fun f(a: Int, b: Int): Int = a + b

fun g(a:String, b:String): String = a + b

fun h():Unit = println("h()")

fun main() {
  val f = f(1,1)
  val g = g("1","1")
  val h = h()

  println("Int")
  println("String")
  println("Unit")
}