import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var count = 0
    repeat(3){
       val num = scanner.nextInt()
        if (num > 0) count++
    }
    print(count == 1)
}