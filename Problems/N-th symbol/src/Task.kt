import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val input = readLine()!!
    val num = readLine()!!.toInt()

    print("Symbol # $num of the string \"$input\" is \'${input[num - 1]}\'")
}