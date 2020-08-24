import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num = scanner.next()
    val num1 = Character.getNumericValue(num[0])
    val num2 = Character.getNumericValue(num[1])
    val num3 = Character.getNumericValue(num[2])
    print(num1 + num2 + num3)
}