import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val(a, opr, b) = Array(3) { scanner.next() }

    println(when (opr) {
        "equals" -> a == b
        "plus" -> a + b
        "endsWith" -> a.endsWith(b)
        else -> "Unknown operation"
    })
}