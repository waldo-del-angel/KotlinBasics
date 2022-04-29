/**
 * Let's make a simple converter that converts values to the following three types – Int, Double, and Boolean.
 */
fun main() {
    // Read value
    val value = readLine()

    // printing values conversions
    println(value?.toInt())
    println(value?.toDouble())
    println(value?.toBoolean())
}