/**
 * Write a program that reads a line and then prints it 10 times,
 * each on a new line. A line may include multiple words separated by spaces.
 */
fun main() {
    val text = readln()
    repeat(10) {
        println(text)
    }
}