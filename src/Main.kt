data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice", 29), Person("Bob", 31))
    val oldset = persons.maxBy { it.age ?: 0 }
    println("Greetings old set: $oldset")
}