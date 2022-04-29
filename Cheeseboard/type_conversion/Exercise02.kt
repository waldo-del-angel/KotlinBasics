/**
 * It is known that the Galactic Empire has more ships
 * than the Rebel Alliance and the number of the Empire's ships is
 * a multiple of the number of the rebels' ships.
 *
 * Write a program that calculates how many times larger the Empire fleet is.
 * Input: two integers as strings (each starting on a new line).
 * Output: Int value.
 */
fun main() {
    // Read line per line
    val empiresShips = readLine()!!
    val rebelsShips = readLine()!!

    // Calculate value and print cast result
    val largerEmpireFleet: Double = empiresShips.toDouble() / rebelsShips.toDouble()
    println(largerEmpireFleet.toInt())
}