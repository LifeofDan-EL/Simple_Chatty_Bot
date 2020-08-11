import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    var sum = 0
    while (a <= b) {
        if (a % c == 0) {
            sum++
        }
        a++
    }
    print(sum)
}