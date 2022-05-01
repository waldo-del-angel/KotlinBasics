/**
 * Write a program that reads one word and prints it repeatedly
 * as many times as there are letters in it. Use string templates.
 * Input:
 *      a single string.
 * Output:
 *      a single string. for ex. N repetitions of the word string: ...
 */
fun main() {
    val wherever = readLine()!!
    println("${wherever.length} repetitions of the word $wherever: ${wherever.repeat(wherever.length)}")
}