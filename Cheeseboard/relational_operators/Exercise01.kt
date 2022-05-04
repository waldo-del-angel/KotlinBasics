/**
 * Write a program that reads three numbers and checks if they are different (numbers are not equal to one another).
 * Sample Input:
 *  5
 *  5
 *  9
 * Sample Output:
 *  false
 */
fun main() {
    val n1 = readLine()!!.toInt()
    val n2 = readLine()!!.toInt()
    val n3 = readLine()!!.toInt()

    val y = n1 != n2 && n1 != n3 && n2 != n3
    println(y)
}