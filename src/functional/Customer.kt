package functional

data class Customer(val name: String, val email: String)

fun main(args: Array<String>) {
    val customer = Customer("mad", "integral5137@gmail.com")
    val hashCode = customer.hashCode()
    val equals = customer.equals(hashCode)
    val copy = customer.copy()
    val component1 = customer.component1()
    val component2 = customer.component2()
    println("hashCode: $hashCode")
    println("equals: $equals")
    println("copy: $copy")
    println("component1: $component1")
    println("component2: $component2")
}