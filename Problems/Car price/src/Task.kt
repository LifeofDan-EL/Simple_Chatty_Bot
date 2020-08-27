import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val argument = scanner.next()
    val value = scanner.nextInt()
    when (argument) {
        "old" -> carValue(age = value)
        "passed" -> carValue(km = value)
        "speed" -> carValue(speed = value)
        "auto" -> carValue(trans = value)
    }
}

fun carValue(startingValue: Int = 20000, age: Int = 5, km: Int = 100000, speed: Int = 120, trans: Int = 0) {
    val finalAmount = startingValue - (age * 2000) - ((120 - speed)* 100) - ((km / 10000)* 200) + (1500 * trans)
    print(finalAmount.toInt())
}
