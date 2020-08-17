import java.math.BigInteger

fun main() {
    val a = BigInteger(readLine()!!)
    val b = BigInteger(readLine()!!)
    val c = BigInteger(readLine()!!)
    println(when {
        a == b && a == c -> 3
        a == b || a == c || b == c -> 2
        else -> 0
    })
}