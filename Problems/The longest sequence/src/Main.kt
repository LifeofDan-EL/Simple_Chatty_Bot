import java.util.*

fun main(args: Array<String>) {
//    val scanner = Scanner(System.`in`)
//    val arr = IntArray(scanner.nextInt()) { scanner.nextInt() }
//
//    for (i in arr) {
//        print("$i ")
//    }
    for (i in 1..4) {
        loop@ for (j in 1..3) {
            for (k in 1..2) {
                if (i == 2 || j == 3 || k == 2) break@loop
                print("$k")
            }
        }
    }
}