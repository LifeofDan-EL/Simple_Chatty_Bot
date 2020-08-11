import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val value = arrayListOf<Int>()

    repeat(n) {
        value.add(scanner.nextInt())
    }

    println(value.sum())
}