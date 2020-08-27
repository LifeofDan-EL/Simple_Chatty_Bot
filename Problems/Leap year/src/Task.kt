import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()

    if (num % 4 == 0 && num % 100 != 0 || num % 400 == 0) print("Leap") else print("Regular")
}