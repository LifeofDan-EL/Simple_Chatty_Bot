import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val(a, b) = Array(2) { scanner.nextInt() }
    print("$a $b")
}