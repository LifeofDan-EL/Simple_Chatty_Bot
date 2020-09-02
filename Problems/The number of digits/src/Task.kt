import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.next()
    when (num.length) {
        1 -> println("1")
        2 -> println("2")
        3 -> println("3")
        4 -> println("4")
    }
}