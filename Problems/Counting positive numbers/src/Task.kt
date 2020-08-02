import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var count = 0

    repeat(n) {
        val next = scanner.nextInt()
        if (next > 0) count++
    }
    print(count)
}