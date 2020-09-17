import java.util.*
import kotlin.math.floor

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print(floor(Math.cbrt(scanner.nextInt().toDouble())).toInt())
}