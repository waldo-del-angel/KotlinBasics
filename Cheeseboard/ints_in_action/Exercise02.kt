const val LIMIT = 10_000u

/**
 * N squirrels found K nuts and decided to split them equally.
 * Find how many nuts will be left after each of the squirrels
 * takes an equal amount of nuts.
 * 
 * Input data format
 *      There are two positive integers N and K, each of them is not greater than 10000.
 */
fun main() {
    val n = readLine()!!.toUInt()
    val k = readLine()!!.toUInt()
    if (n <= LIMIT && k <= LIMIT) {
        println(k % n)
    }
}