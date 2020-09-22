import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    val number = IntArray(input) { scanner.nextInt() }

        if (input == 1) {
            print(number.toList()[0])
        } else {
            val new = number.sortedArrayDescending().toList()
            println(new[0] * new[1])
        }
    }