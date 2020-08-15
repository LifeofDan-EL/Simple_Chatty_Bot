import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var a = 0
    var b = 0
    var c = 0
    var d = 0

    repeat(n) {
        val input = scanner.nextInt()
        if (input == 2) d++
        if (input == 3) c++
        if (input == 4) b++
        if (input == 5) a++
    }
print("$d $c $b $a")
}