import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val i = scanner.nextDouble()

    print(i.pow(3) + i.pow(2) + i + 1)
}