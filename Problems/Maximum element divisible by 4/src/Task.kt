import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val x = scanner.nextInt()

    val y = IntArray(x) { scanner.nextInt() }

    val isElement = y.filter { it % 4 == 0 }

    println(isElement.max())
}
