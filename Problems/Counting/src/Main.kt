import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    val arr = IntArray(size) { scanner.nextInt() }
    print(Collections.frequency(arr.toList(), scanner.nextInt()))
}