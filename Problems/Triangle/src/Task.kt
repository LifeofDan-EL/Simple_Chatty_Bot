import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()

    print(if (num1 + num2 > num3 && num2 + num3 > num1 && num3 + num1 > num2) "YES" else "NO")
}