import java.math.BigInteger
import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)
    val (a, b) = Array(2) { scanner.nextBigInteger() }
    print(lcm(a, b))
}
        fun lcm(a: BigInteger, b: BigInteger): BigInteger {
            val mul = a.multiply(b)
            val gcd = a.gcd(b)
            return mul.divide(gcd)
}