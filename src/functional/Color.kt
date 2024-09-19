package functional

enum class Color(val red: Int, val green: Int, val blue: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
}

fun main(args: Array<String>) {
    fun colors(color: Color) = when (color) {
        Color.RED -> "R"
        Color.GREEN -> "G"
        Color.BLUE -> "B"
    }

    val red = colors(Color.RED)
    println(red)
}