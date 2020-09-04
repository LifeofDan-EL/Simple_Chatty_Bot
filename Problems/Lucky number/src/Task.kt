
fun main() {
    val num = readLine()!!
    val str = num.toString()
    val n = str.length
    val numbers = str.map { it.toString().toInt() }

    val num1 = numbers.slice(0..n / 2 - 1)
    val num2 = numbers.slice(n / 2..n - 1)

    if (num1.sum() == num2.sum()) println("YES") else println("NO")
}
