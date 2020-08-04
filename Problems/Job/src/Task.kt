import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val age = scanner.nextInt()

    if (age in 18..59) {
        print(true)
    } else print(false)
}