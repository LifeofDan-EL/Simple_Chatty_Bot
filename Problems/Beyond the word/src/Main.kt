fun main(args: Array<String>) {
    val number = readLine()!!

    for (c in 'a'..'z') {
        if (number.contains(c)) continue
        print(c)
    }
}