import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print(scanner.next().first().toUpperCase() == scanner.next().last().toUpperCase())
}