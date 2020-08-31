import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val numbers = arrayOf(0, 2, 5)
    var sum = 0

    for (i in numbers.lastIndex downTo 0) {
        sum += numbers[i]
    }
    print(sum)
}