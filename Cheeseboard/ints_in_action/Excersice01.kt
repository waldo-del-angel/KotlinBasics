const val LIMIT = 10_000

/**
 * Given a natural number N, not greater than 10000. Output the even number that follows this N.
 */
fun main() {
    var natNumber: Int = readLine()!!.toInt()
    if (natNumber <= LIMIT) {
        ++natNumber
        if (natNumber % 2 == 0) {
            println(natNumber)
        } else {
            println(++natNumber)
        }
    }
}