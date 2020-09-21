import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val sep = " "
    val x = mutableListOf(1, 2, 3, 4, 5)
    val y = mutableListOf(1, 2, 3, 4, 5)

    repeat(3) {
        x.remove(scan.nextInt())
        y.remove(scan.nextInt())
    }
    println(x.joinToString(sep))
    println(y.joinToString(sep))
}