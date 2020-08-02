import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    var input = scanner.nextInt()

    while (input >= 10) input /= 10

    print(input)
}

