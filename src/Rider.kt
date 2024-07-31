class Rider(val brand: String, private val model: String, val year: Int) {
    fun crack(message: String): String {
        return "Rider crack ${this.model}, $message!"
    }
}