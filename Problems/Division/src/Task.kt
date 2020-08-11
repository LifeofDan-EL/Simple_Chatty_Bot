import java.util.*
fun divide(a: Long, b: Long): Double {
    return a.toDouble() / b.toDouble()
}

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val b = scanner.nextLong()
    println(divide(a, b))
}