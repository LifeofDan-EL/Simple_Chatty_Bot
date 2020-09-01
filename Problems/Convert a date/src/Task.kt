fun main() {
    val str = readLine()!!
    val parts = str.split("-")
    print("${parts[1]}/${parts[2]}/${parts[0]}")
}