import java.util.*
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val size = scanner.nextInt()
    val array = IntArray(size) { scanner.nextInt() }
    print(array.indexOf(array.max()!!))
}