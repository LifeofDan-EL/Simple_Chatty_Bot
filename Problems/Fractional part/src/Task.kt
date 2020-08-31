import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextDouble()
    val r = Math.floor((num - Math.floor(num)) * 10)
    print(r.toInt())
}