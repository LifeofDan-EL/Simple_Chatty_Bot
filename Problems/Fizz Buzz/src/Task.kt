import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val k = scanner.nextInt()

    for (a in n..k) {
    if (a % 3 == 0 && a % 5 == 0) {
        println("FizzBuzz")
    } else if (a % 5 == 0) {
        println("Buzz")
    } else if (a % 3 == 0) {
        println("Fizz")
    } else println(a)
    }
}