import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var larger = 0
    var smaller = 0
    var perfect = 0
    val n = scanner.nextInt()
    val size = Array(n) { scanner.nextInt() }

    for (i in size) {
        when (i) {
            1 -> larger += 1
            -1 -> smaller += 1
            0 -> perfect += 1
        }
    }
    print("$perfect $larger $smaller")
}