class Person(firstName: String, lastName: String) {
    val first = firstName
    val last = lastName
}

// we can define properties directly within the constructor

class Pet(val petType: String, val name: String) {

}

// we can provide multiple constructors to allow for instantiation with different args
// we can also set default parameter values for class arguments to avoid the need for a secondary constructor like below

class Friend(val name: String) {
    constructor() : this("n/a") {

    }
}

// custom getters and setters
    // by default, the compiler generates getters and setters for class properties
        // getter only for val
        // getter and setter for var
    // we can override the default getter and setter definitions as follows

class Point(x: Int, y: Int) {

    // setter for x and y will print the new value
    // getter for x and y will print the current value

    var x = x
        set(value) {
            field = value
            println(value)
        }

        get() {
            println(field)
            return field
        }

    var y = y
        set(value) {
            field = value
            println(value)
        }

        get() {
            println(field)
            return field
        }

}

// class method syntax

class Amigo(val firstName: String, val lastName: String) {
    var nickName: String? = null
        set(value) {
            field = value
            println("The new nickname is $value")
        }

        get() {
            println("The nickname is $field")
            return field
        }

    fun printInfo() {
        var nickNameToPrint = nickName ?: "no nickname"
        println("$firstName $nickNameToPrint $lastName")
    }
}

// Visibility Modifiers
    // public: available in main and other classes. classes, methods, properties are public by default
    // internal: class is public within the module
    // protected: only available within a class / subclasses
    // private: only available within the file in which the class is implemented

// Interfaces


