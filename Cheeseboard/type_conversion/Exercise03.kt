/**
 * Write a program that takes two large numbers as input, converts
 * them to Long, and prints the result of their summation.
 *
 * Input: two long numbers as strings (each starting on new line).
 * Output: Long value.
 */
fun main() {
    // Read long numbers line per line
    val number1: Long = readLine()!!.toLong()
    val number2: Long = readLine()!!.toLong()

    // Printing sum of values
    println(number1 + number2)
}