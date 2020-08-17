import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val(num1, num2, num3, num4, num5) = Array(5) { scanner.nextInt() }
    val num6 = scanner.nextInt()
    print("$num1:$num2:$num3 $num4/$num5/$num6")
}