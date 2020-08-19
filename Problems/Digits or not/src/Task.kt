import java.util.*
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val(c1, c2, c3, c4) = Array(4) { scanner.next().first().isDigit().toString() }
    print("$c1\\$c2\\$c3\\$c4")
}