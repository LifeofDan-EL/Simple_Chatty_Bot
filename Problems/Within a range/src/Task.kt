import java.util.*

fun main(){
    evenOrOdd(2)
}
fun evenOrOdd(number: Int): String {
   val input = Scanner(System.`in`)


    val num = input.nextInt()

    if (num % 2 == 0) print("Even")
    else print("Odd")

    return number.toString()
}