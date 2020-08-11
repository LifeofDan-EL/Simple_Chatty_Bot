import java.util.*

fun square(a: Int): Int {
    return a * a
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    println(square(number))
}