val VOWEL_REGEX = "a|e|i|o|u".toRegex()

// Return true if letter is a vowel, otherwise false
fun isVowel(letter: String) = letter.matches(VOWEL_REGEX)

/**
 * Write a function that checks whether a letter
 * of the basic Latin alphabet is a vowel. The input is one letter.
 */
fun main() {
    val letter = readLine()!!.first().toLowerCase()
    println(isVowel(letter.toString()))
}