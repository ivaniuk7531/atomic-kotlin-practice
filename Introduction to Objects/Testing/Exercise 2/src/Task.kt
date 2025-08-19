// Testing/Task2.kt
package testingExercise2
import atomictest.eq
import atomictest.neq

fun sum(a: Int, b: Int, c: Int): Int = a + b + c

fun main() {
  sum(1, 1, 1) eq 3
  sum(5, 4, 1) eq 10
  sum(5, 5, 30) eq 40
  sum(5, 11, 6) eq 22
  sum(29, 1, 1) eq 31

    sum(29, 12, 61) neq 311
    sum(297, 121, 641) neq 2311
    sum(293, 1, 12) neq 11
    sum(29, 11, 12) neq 21
    sum(292, 11, 21) neq 111
}