import java.util.Scanner
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val(a, b, c) = Array(3) { scanner.nextDouble() }
    val p = (a + b + c) / 2
    print(sqrt(p * (p - a) * (p - b) * (p - c)))
}