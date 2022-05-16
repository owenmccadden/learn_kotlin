fun main(args: Array<String>) {

}

// Control Flow Logic

fun controlFlow(): Unit {
    // standard control flow logic
    val name = "Owen"
    var greeting: String? = null

    if (greeting != null) {
        println(greeting)
    } else {
        println("Hi")
    }

    println(name)
}

fun whenStatement(greeting: String?): Unit {
    // the when statement in kotlin is similar to the switch statement in java
    when(greeting) {
        null -> println("Hi")
        else -> println(greeting)
    }
}

// Function Syntax

fun sayHelloVerbose(name: String): Unit {
    println("Hello $name")
}

fun sayHello(name: String) = println("Hello $name")

// Collections and Iterations

fun arraySyntax() {
    // arrays are immutable
    val things = arrayOf("one", "two", "three")

    for (thing in things) {
        println(thing)
    }

    for (i in 0 until things.size) {
        println(things[i])
    }

    things.forEach {thing ->
        println(thing)
    }

    things.forEachIndexed { index, thing ->
        println("$thing is at index $index")
    }
}

fun listSyntax() {
    // lists can be mutable or immutable, depending on how they are initialized

    var things = listOf("one", "two", "three")

    things.forEach { thing ->
        println(thing)
    }

    var newThings = mutableListOf("one", "two", "three")
    newThings.add("four")

    newThings.forEach {thing ->
        println(thing)
    }

}

fun mapSyntax() {
    // maps are standard like hashmaps in java or dictionaries in python
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { (key, value) -> println("$key -> $value")}

    println()

    val newMap = mutableMapOf<Int, String>()
    newMap[1] = "a"
    newMap[2] = "b"
    newMap[3] = "c"
    newMap[4] = "d"
    
    newMap.forEach { (key, value) -> println("$key -> $value")}
}

// vararg, named args, default parameter values

fun multipleGreeting(greeting: String, vararg names: String) {
    // vararg allows for a variable number of arguments of a certain typee
    names.forEach { name ->
        println("$greeting $name")
    }
}

fun varArgSyntax() {
    // we can pass 0-n comma separated values as a vararg parameter like so
    multipleGreeting("Hello", "Owen", "Thomas", "Michael")

    // we can also use the spread operator to pass the contents of an array
    var exampleNames = arrayOf("Owen", "Michael", "James")
    multipleGreeting("Hello", *exampleNames)
}

fun namedArgsSyntax() {
    // we can use the parameter names in the function invocation to avoid issues with parameter order
    // must used named argument syntax for all or none of the args
    multipleGreeting(names = *arrayOf("Owen", "thomas"), greeting = "Hello")
}

fun defaultParamsSyntax(input: Int = 0) {
    println(input)
}

fun testDefaultParams() {
    // we can set default values in the function definition similar to python
    defaultParamsSyntax()
    defaultParamsSyntax(10)
}