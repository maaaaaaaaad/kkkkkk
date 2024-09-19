package functional

class Rectangle(private val width: Double, private val height: Double) {
    val isSquare: Boolean
        get() = width == height
}

fun main(args: Array<String>) {
    val inspectRectangle = Rectangle(90.0, 90.1)
    if (inspectRectangle.isSquare) println(true) else println(false)
}