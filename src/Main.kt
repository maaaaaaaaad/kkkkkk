import datas.Person

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

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

    fun eval(expr: Expr): Int {
        if (expr is Num) {
            val n = expr as Num
            return n.value
        }
        if (expr is Sum) {
            return eval(expr.left) + eval(expr.right)
        }
        throw IllegalArgumentException("Unknown expression")
    }

    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))

}

