import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    var arr = 1
    do {
        println(arr * arr)
        arr++
    } while (arr * arr <= num)
}

