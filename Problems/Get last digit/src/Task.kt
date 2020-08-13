import java.util.*

fun getLastDigit(a: Int): Char {
    val r = a.toString()
    return r[r.lastIndex]
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    println(getLastDigit(a))
}