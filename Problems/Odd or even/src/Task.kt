import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val input = scanner.nextInt()

    if (input % 2 == 0) print("EVEN") else print("ODD")
}