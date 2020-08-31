import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val arrayInt = Array(4) { scanner.nextInt() }
    print(arrayInt.max())
}