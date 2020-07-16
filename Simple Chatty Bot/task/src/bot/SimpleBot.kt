package bot

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Danbot.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    // reading a name
    var yourName: String = scanner.nextLine()

    println("What a great name you have, $yourName!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    // reading all remainders
    var remainder3:Int = scanner.nextInt()
    var remainder5:Int = scanner.nextInt()
    var remainder7:Int = scanner.nextInt()

    var age : Int = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105

    var yourAge = age

    println("Your age is $yourAge; that's a good time to start programming!")
}
