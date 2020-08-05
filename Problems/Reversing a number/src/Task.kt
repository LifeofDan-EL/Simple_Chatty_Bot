import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var reversed = 0
    var num = scanner.nextInt()

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }
    print(reversed)
}