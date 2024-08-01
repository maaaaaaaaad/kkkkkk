interface RiderInterface {
    fun crack(message: String): String
}

class Rider(val brand: String, private val model: String, val year: Int) : RiderInterface {
    override fun crack(message: String): String {
        return "Rider crack ${this.model}, $message!"
    }
}