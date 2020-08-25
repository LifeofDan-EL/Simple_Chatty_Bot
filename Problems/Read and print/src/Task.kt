
fun main(args: Array<String>) {
    val(word1, word2) = Array(2) { readLine()!! }
    val number = readLine()!!.split(" ")
    println(word1)
    println(word2)
    number.forEach(::println)
}