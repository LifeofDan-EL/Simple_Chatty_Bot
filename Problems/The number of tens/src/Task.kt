import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    val lastDigit = input % 10

    println((input - lastDigit) % 100 / 10)
}