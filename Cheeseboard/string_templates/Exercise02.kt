/**
 * Write a program that reads two numbers and prints their sum.
 * The examples below demonstrate what the result should look like.
 * Input:
 *      two numbers of the Int type
 * Output:
 *      Use the following template: n1 + n2 = sum
 */
fun main() {
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()

    println("$n1 plus $n2 equals ${n1 + n2}")
}