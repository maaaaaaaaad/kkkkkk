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

    fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
        setOf(Color.RED, Color.BLUE) -> Color.GREEN
        else -> Color.RED
    }

    val red = mix(Color.RED, Color.RED)
    val green = mix(Color.RED, Color.BLUE)
    println("red: $red, green: $green")
}