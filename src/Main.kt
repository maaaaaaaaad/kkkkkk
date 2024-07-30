fun main() {
    val day = 3

    val result = when (day) {
        1 -> "mon"
        2 -> "thu"
        3 -> "wen"
        4 -> "thu"
        5 -> "fri"
        6 -> "sat"
        7 -> "sun"
        else -> "not"
    }

    println(result)

    var counter = 0

    do {
        println(counter)
        counter++
    } while (counter < 5 + 1)
}