// Sets/Task3.kt
package setsExercise3
import atomictest.eq

val meats = setOf("beef", "chicken")
val fruits = setOf("apple", "orange", "banana", "kiwi")
val vegetables = setOf("beans", "peas", "carrots", "sweet potatoes", "asparagus", "spinach")

// countPercent

fun percentMeat(groceryCart: Set<String>): Double =
  (groceryCart.count { it in meats }.toDouble() / groceryCart.size) * 100

fun percentFruit(groceryCart: Set<String>): Double =
  (groceryCart.count { it in fruits }.toDouble() / groceryCart.size) * 100

fun percentVeggies(groceryCart: Set<String>): Double =
  (groceryCart.count { it in vegetables }.toDouble() / groceryCart.size) * 100

fun percentOther(groceryCart: Set<String>): Double {
  val allKnownItems = meats + fruits + vegetables
  return (groceryCart.count { it !in allKnownItems }.toDouble() / groceryCart.size) * 100
}


fun main() {
  val groceryCart = setOf("apple", "pretzels", "bread", "orange", "beef",
    "beans", "asparagus", "sweet potatoes", "spinach", "carrots")

  percentMeat(groceryCart) eq 10.0
  percentFruit(groceryCart) eq 20.0
  percentVeggies(groceryCart) eq 50.0
  percentOther(groceryCart) eq 20.0
}