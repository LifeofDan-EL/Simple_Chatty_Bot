import java.util.*
import kotlin.math.cos
import kotlin.math.sin

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextDouble()
    print(sin(num) - cos(num))
}