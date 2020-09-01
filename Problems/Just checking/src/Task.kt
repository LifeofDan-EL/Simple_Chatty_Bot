import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val numbers = IntArray(n)

    for (index in 0 until n) {
        numbers[index] = scanner.nextInt()
    }

    val a = scanner.nextInt()
    val b = scanner.nextInt()

    var isTogether = false

    for (index in 0 until numbers.lastIndex) {
        if (numbers[index] == a && numbers[index + 1] == b) {
            isTogether = true
        } else if (numbers[index] == b && numbers[index + 1] == a) {
            isTogether = true
        }
    }
    println(if (isTogether) "YES" else "NO")
}