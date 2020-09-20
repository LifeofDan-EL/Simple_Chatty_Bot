import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var arr = mutableListOf<Int>()
    do {
        val number = scanner.nextInt()
        arr.add(number)
    } while (number != 0)
    print(arr.max())
}
