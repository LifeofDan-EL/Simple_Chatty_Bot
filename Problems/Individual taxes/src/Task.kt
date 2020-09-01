import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val size = scanner.nextInt()
    val companies = IntArray(size) { scanner.nextInt() }
    val taxes = IntArray(size) { scanner.nextInt() }
    var maxTaxes = 0
    var companyWithMaxTaxes = 0

    for (i in 0..companies.lastIndex) {
        val companyTaxes = companies[i] * taxes[i]
        if (companyTaxes > maxTaxes) {
            maxTaxes = companyTaxes
            companyWithMaxTaxes = i + 1
        }
    }

    println(companyWithMaxTaxes)
}