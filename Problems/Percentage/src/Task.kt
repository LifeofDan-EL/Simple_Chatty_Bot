import java.util.*
import java.math.BigInteger
fun main() {
    val scanner = Scanner(System.`in`)
    val oneHundred = BigInteger.valueOf(100)
    val(a, b) = Array(2) { scanner.nextBigInteger() }
    val p1 = (oneHundred * a / (a + b)).toInt()
    val p2 = (oneHundred * b / (a + b)).toLong()
    print("$p1% $p2%")
}