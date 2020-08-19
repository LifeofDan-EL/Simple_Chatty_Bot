fun parseCardNumber(cardNumber: String): Long {
    val ch = ' '
    var count = 0
    for (i in 0..cardNumber.length - 1) {
        if (ch == cardNumber[i]) {
            ++count
        }
    }
    val newCard = cardNumber.replace("\\s".toRegex(), "").toLong()
    if (count == 3) return newCard else throw Exception("Incorrect Card")
}
