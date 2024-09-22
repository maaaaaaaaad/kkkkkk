package functional

abstract class BehaviorAbstract {
    abstract fun doSomething(): String
    abstract fun sleep(): String
}

class Behavior : BehaviorAbstract() {
    override fun doSomething(): String {
        return "doSomething"
    }

    override fun sleep(): String {
        return "sleep"
    }
}

fun main(args: Array<String>) {
    val behavior = Behavior()
    println("behavior = ${behavior.doSomething()}")
    println("behavior = ${behavior.sleep()}")
}