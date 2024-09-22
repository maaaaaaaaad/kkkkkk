import datas.Person

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz: $i"
    i % 3 == 0 -> "Fizz: $i"
    i % 5 == 0 -> "Buzz: $i"
    else -> "$i "
}

fun main(args: Array<String>) {
    val persons = listOf(Person("Alice", 29), Person("Bob", 31), Person("Carol"))
    val maxAgePerson = persons.maxBy { it.age ?: 0 }
    val privateAgePerson = persons.minBy { it.age ?: 0 }

    println("Max age set: $maxAgePerson")
    println("Empty age set: $privateAgePerson")

    val alice = persons.find { it.name == "Alice" }
    println("Alice set: $alice")
    if (alice != null) alice.age = 20
    println("New Alice set: $alice")

    fun eval(expr: Expr): Int = when (expr) {
        is Num -> {
            println("Expr value: $expr.value")
            expr.value
        }

        is Sum -> eval(expr.left) + eval(expr.right)
        else -> throw IllegalArgumentException("Unknown expression")
    }

    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    val oneToTen = 1..10
    oneToTen.forEach { println("It's too ten: $it") }

    for (i in 1..100) {
        println(fizzBuzz(i))
    }
}

