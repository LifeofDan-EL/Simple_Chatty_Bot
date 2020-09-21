import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val word = scanner.next()

    var count = 0
    for (i in word) {
        if (word.count { it == i } == 1) count++
    }
    println(count)
}