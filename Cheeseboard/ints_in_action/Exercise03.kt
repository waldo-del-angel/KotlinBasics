/**
 * Write a program that reads a three-digit number,
 * reverses the order of its digits, and outputs a new number.
 */
fun main() {
    val a = readLine()!!.reversed()
    println(a.toInt())
}