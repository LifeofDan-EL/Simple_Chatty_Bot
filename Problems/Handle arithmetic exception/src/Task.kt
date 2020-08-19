import java.util.*
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val(a, b) = Array(2) { scanner.nextInt() }
    if (b == 0) {
        print("Division by zero, please fix the second argument!")
    } else print(a / b)
}