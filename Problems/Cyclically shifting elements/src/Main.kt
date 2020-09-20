import java.util.*

    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        val arr = IntArray(scanner.nextInt()) { scanner.nextInt() }
        val list = arr.toList()
        Collections.rotate(list, 1)
        for (i in list) {
            print("$i ")
        }
    }