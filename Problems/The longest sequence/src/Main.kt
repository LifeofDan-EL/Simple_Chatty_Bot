import java.util.*

fun main(args: Array<String>) {
    val regex = Regex(".ea..")

    val string1 = "teach"
    val string2 = "learning"
    val string3 = ".ea.."
    val string4 = "learning"
    val string5 = "....."

    println(string1.matches(regex))
    println(string2.matches(regex))
    println(string3.matches(regex))
    println(string4.matches(regex))
    println(string5.matches(regex))

}