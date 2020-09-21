fun main() {
    val number = readLine()!!
    for (i in number) {
        if (i.isDigit()) {
            println(i)
            break
        }
    }
}