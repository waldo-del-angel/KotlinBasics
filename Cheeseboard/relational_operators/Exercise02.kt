const val RESULT = 20

/**
 * Write a program that reads numbers a, b, c and checks whether
 * any pair of arguments (ab, ac, or bc) sums to 20.
 * 
 * Output true or false.
 */
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    val ab = a + b
    val ac = a + c
    val bc = b + c

    if (ab == RESULT || ac == RESULT || bc == RESULT) {
        println(true)
    } else {
        println(false)
    }

}