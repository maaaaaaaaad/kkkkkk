data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice", 29), Person("Bob", 31), Person("Carol"))
    val maxAgePerson = persons.maxBy { it.age ?: 0 }
    val privateAgePerson = persons.minBy { it.age ?: 0 }
    println("Max age set: $maxAgePerson")
    println("Empty age set: $privateAgePerson")
}