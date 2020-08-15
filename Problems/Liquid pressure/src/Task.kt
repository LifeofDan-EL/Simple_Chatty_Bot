import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val(p, h) = Array(2) { scanner.nextDouble() }
    print(p * h * 9.8)
}