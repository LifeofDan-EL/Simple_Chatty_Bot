
import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val(a, b, c) = Array(3) { scanner.nextDouble() }
    val root1 = -(b + kotlin.math.sqrt(b.pow(2.0) - 4 * a * c)) / (2 * a)
    val root2 = -(b - kotlin.math.sqrt(b.pow(2.0) - 4 * a * c)) / (2 * a)
    print("${Math.min(root1,root2)}" + " ${Math.max(root1,root2)}")
}