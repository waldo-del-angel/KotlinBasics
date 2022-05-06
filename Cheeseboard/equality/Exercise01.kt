class Pirate (name : String) {
    var name: String = name
        private set    
}

/**
 * Fix the declaration of the captain variable, create a new Pirate object,
 * assign the variable captain to a new value, and print the name of the current captain again.
 * Sample Output 1:
 *  Hector Barbossa
 *  Jack Sparrow
 */
fun main() {
    val captain = Pirate("Hector Barbossa")
    println(captain.name)

    val captain2 = Pirate("Jack Sparrow")
    println(captain2.name)
}