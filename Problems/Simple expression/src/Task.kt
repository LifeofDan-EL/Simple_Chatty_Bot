import java.util.*
fun main() {
      val scanner = Scanner(System.`in`)
      val(a, b, c, d) = Array(4) { scanner.nextBigInteger() }
      print(-a * b + c - d)
}