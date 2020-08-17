import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val(num1, num2) = Array(2) { scanner.nextInt() }
    print("$num1 plus $num2 equals ${num1 + num2}")
}