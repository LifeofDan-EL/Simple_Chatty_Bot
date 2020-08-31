import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()

    val array = IntArray(number) { scanner.nextInt() }
    var numberOfTriples = 0
    for (i in 0..array.lastIndex - 2) {
        if (array[i] == array[i + 1] - 1 && array[i + 1] - 1 == array[i + 2] - 2) {
            numberOfTriples++
        }
    }
    println(numberOfTriples)
}