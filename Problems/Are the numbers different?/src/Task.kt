import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()
    val num3 = scanner.nextInt()

    if (num1 == num2 || num2 == num3 || num3 == num1) {
        print(false)
    } else print(true)
}