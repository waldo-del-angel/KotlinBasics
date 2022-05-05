fun getLastDigit(digit: Int) = (if (digit < 0) digit * -1 else digit) % 10

/**
 * Write a function named getLastDigit that takes one number and returns its last digit.
 */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}