import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextInt()
    val array = IntArray(size) { scanner.nextInt() }
    val number = scanner.nextInt()
    var output = "YES"

    for (i in array.indices) {
        if (number != array[i]) {
            output = "NO"
        } else {
            output = "YES"
            break
        }
    }

    println(output)
}