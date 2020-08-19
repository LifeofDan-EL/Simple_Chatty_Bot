import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val (a, b, c) = Array(3) { scanner.nextInt() }

    if (a > c && a > b) {
        print(a)
    } else if (b > a && b > c) {
        print(b)
    } else print(c)
}