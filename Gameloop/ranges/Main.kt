/**
 * Write a program that reads three integer numbers and prints
 * true if the first number is between the second and the third
 * ones (inclusive). Otherwise, it is to print false. The second
 * number is always less than the third one. Use ranges to solve
 * the problem.
 */
fun main() {
    val first = readln().toInt()
    val second = readln().toInt()
    val third = readln().toInt()

    println(first in second..third)
}