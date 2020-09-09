import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    println(when (num) {
        2 -> "Yes!"
        in 1..4 -> "No!"
        else -> "Unknown number"
    })
}