// write your code here
fun divide (number1: Long, number2: Long) = number1.toDouble() / number2.toDouble()

/**
 * Write a function named divide that takes two long numbers and returns a double value.
 * It should return the result of the division of the first argument by the second one.
 * It's guaranteed that the second argument is not zero.
 */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}