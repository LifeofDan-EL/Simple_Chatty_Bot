fun main() {
    greeting(name = readLine()!!)
}

fun greeting(line: String = "Hello,", name: String = " ") {
    if (name == "HIDDEN") {
        print("$line secret user!")
    } else print("$line $name!")
}