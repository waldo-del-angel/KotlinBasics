import java.util.Scanner

/**
 * Write a program that reads five words from the
 * standard input and outputs each word on a new line.
 * Words can be ordered differently in the input stream.
 *
 * To solve the problem, use Scanner.
 * Input:
 *      This course
 *      teach you Kotlin
 * Output:
 *      This
 *      course
 *      teach
 *      you
 *      Kotlin
 */
fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.next()
    val b = scanner.next()
    val c = scanner.next()
    val d = scanner.next()
    val e = scanner.next()

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
}