fun main(args: Array<String>) {
    fizzBuzz(15)
}

fun sandbox() {
    println("Hello World!")
    // variables (statically typed, but kotlin uses type inference)
        // val: used to declare immutable variables
        // var: used to declare mutable variables

    // datatypes: strings, integers, doubles, booleans

    val flag: Boolean = true // immutable boolean
    var age: Int = 21 // muttable integer
    val name: String = "Owen McCadden" //immutable string
    var weight: Double = 155.5 // mutable double

    println("My name is $name, and my age is $age. My weight is $weight.")

    // operators: standard mathematical operators (+,-,*,/,%)

    // conditionals: standard conditional logic sytax, does require brackets and parentheses

    if (flag) {
        println("The flag is raised.")
    } else {
        println("The flag is lowered.")
    }

    // collections: kotlin version of an array or list
        // initialize with ListOf() to create an immutable list
        // use MutableListOf() to create a mutable list

    val numbers = listOf(1,2,3)
    println(numbers[0])

    // declaring a list with type
    val nums = listOf<Int>(1,2,3)

    println(nums[0] == numbers[0])

    val mutableNums = mutableListOf(1,2,3)
    println(mutableNums[0])
    mutableNums[0] = 69
    println(mutableNums[0])

    // for loops

    for (num in mutableNums) {
        println(num)
    }

    for (i in 1 until 5) {
        println(i)
    }

    // nullability
        // include a ? to indicate if a variable is nullable
        // ?.(some function) will first check if a variable is null before running a function
}

// functions

// print i from 0 through n
    // if i is divisible by 3 print fizz
    // if i is divisible by 5 print buzz
    // if i is divisible by both 3 and 5 print fizzbuzz
fun fizzBuzz(num: Int) {
    for (i in 1..num) {
        if (i % 3 == 0 && i % 5 != 0) {
            println("Fizz")
        } else if (i % 3 != 0 && i % 5 == 0) {
            println("Buzz")
        } else if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else {
            println(i)
        }
    }
}