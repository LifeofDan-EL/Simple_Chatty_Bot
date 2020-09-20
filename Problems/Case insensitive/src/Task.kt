import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val(a, b) = Array(2) { scanner.next() }
    if (a.toUpperCase() == b.toUpperCase()) print(true) else print(false)
}