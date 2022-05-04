const val LIMIT = 10

/**
 * Write a program that reads a value and
 * checks whether this value is less than 10.
 */
fun main() {
    val n1 = readLine()!!.toInt()
    if (n1 < LIMIT) {
        println(true)
    } else {
        println(false)
    }
}