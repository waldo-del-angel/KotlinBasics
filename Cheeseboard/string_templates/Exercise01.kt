/**
 * You need to write a program that prints dates and times in a special format.
 * Hours, minutes, and seconds are split by a colon, and day, month,
 * and year are split by a slash. Take a look at the examples below.
 * Input:
 *      23 59 59
 *      12 12 2018
 * Output:
 *      23:59:59 12/12/2018
 */
fun main() {
    val (hour, minute, second) = readLine()!!.split(' ')
    val (day, month, year) = readLine()!!.split(' ')

    println("$hour:$minute:$second $day/$month/$year")
}