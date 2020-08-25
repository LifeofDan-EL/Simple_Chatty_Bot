fun main() {
    val(word1, word2, word3) = Array(3) { readLine()!!}
    val test = readLine()!!
    if (test == "~~~") print("$word1~~~$word2~~~$word3") else if (test == "NO SEPARATOR")print("$word1 $word2 $word3") else print("$word1$word2 $word3")
}