fun main() {

    val input = readLine()!!

    if (input.isEmpty()) {
        println(input)
    } else {
        when {
            input.first() == 'i' -> println(input.substring(1).toInt().plus(1))
            input.first() == 's' -> println(input.substring(1).reversed())
            input.isEmpty() -> return
            else -> println(input)
        }
    }
}