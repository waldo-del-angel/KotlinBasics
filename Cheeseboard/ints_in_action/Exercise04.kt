/**
 * There is a three-digit integer (an integer from 100 to 999). Find the sum of its digits.
 */
fun main() {
    val a = readLine()!!
    if (a.toInt() in 100..999) {
        println("${a[0].toString().toInt() + a[1].toString().toInt() + a[2].toString().toInt()}")
    }
}