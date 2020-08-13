import java.util.Scanner

fun isVowel(input: Char): Boolean {
    val words = listOf<Char>('A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u')
    return input in words
}
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val letter = scanner.next()[0]
    println(isVowel(letter))
}