import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val a = arrayListOf<Int>()
    repeat(n) {
        a.add(scanner.nextInt())
    }
    println(if (isSorted(a)) "YES" else "NO")
}

fun isSorted(a: ArrayList<Int>): Boolean {
    for (i in 0 until a.size - 1) {
        if (a[i] > a[i + 1]) {
            return false
        }
    }
    return true
}
