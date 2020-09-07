
fun main(args: Array<String>) {
    val str = readLine()!!
    val parts = str.split("\\s+".toRegex())
    val firstNumber = parts[0].toLong()
    val operation = parts[1]
    val secondNumber = parts[2].toLong()

    if (operation == "/" && secondNumber == 0L) {
        println("Division by 0!")
    } else {
        when (operation) {
            "+" -> print(firstNumber + secondNumber)
            "-" -> print(firstNumber - secondNumber)
            "/" -> print(firstNumber / secondNumber)
            "*" -> print(firstNumber * secondNumber)
            else -> print("Unknown operator")
        }
    }
}