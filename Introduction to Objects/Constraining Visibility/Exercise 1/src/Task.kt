// Visibility/Task1.kt
package constrainingVisibilityExercise1

class Alien (val name: String,
             val species: String,
             private var planet: String = ""
) {


    fun movePlanet(destination: String) {
        this.planet = destination
    }

    override fun toString(): String {
        return "Alien $name, $species: $planet"
    }
}

fun main() {
    val alienA = Alien("Arthricia", "Cat Person", "PurgePlanet")
    val alienB = Alien("Dale", "Giant", "Gearworld")

    println(alienA.toString())
    println(alienB.toString())

    alienA.movePlanet("Earth C-137")
    alienB.movePlanet("Parblesnops")

    println(alienA.toString())
    println(alienB.toString())
}
/* Expected output:
Alien Arthricia, Cat Person: PurgePlanet
Alien Arthricia, Cat Person: Earth C-137
Alien Dale, Giant: Gearworld
Alien Dale, Giant: Parblesnops
*/