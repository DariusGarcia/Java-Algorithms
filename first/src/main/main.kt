import java.lang.Exception

//fun main(args: Array<String>) {
//    println("Enter the first number:")
//    val num1: Int = readln().toInt()
//    println("Enter the second number:")
//    val num2: Int = readln().toInt()
//
//    val result = calc(num1, num2)
//    println("Result: $num1 plus $num2 is $result")
//}
//
//fun calc(x: Int, y: Int) = x + y
//

//fun main() {
//copyAddress(Address())
//}
//
//class Address {
//    var name: String = "Holmes, Sherlock"
//    var street: String = "Baker"
//}
//
//fun copyAddress(address: Address): Address {
//    val result = Address() // there's no 'new' keyword in Kotlin
//    result.name = address.name // accessors are called
//    result.street = address.street
//
//    println("Address name: " + result.name)
//    println("Address street: " + result.street)
//    return result
//
//}

//class Rectangle(val width: Int, val height: Int) {
//    val area: Int // property type is optional since it can be inferred from the getter's return type
//        get() = this.width * this.height
//}
//fun main() {
//    val rectangle = Rectangle(3, 4 )
//    println("Width=${rectangle.width}, height=${rectangle.height}, area=${rectangle.area}")
//}

//fun main() {
////   val items = setOf("apple", "orange", "banana")
////    when {
////        "apple" in items -> println("apple is in items")
////        "orange" in items -> println("juicy orange")
////    }
//
//    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
//    fruits
//        .filter { it.startsWith("a") }
//        .sortedBy { it }
//        .map { it.uppercase() }
//        .forEach { println(it) }
//
//
//
//
//}

// Lambda function
// Short inline functions
//val numbers = listOf(1,2,3,4,5)
//fun squaredNums(): List<Int> {
//    return numbers.map {it * it}
//}

/* Nullable checks */
//fun parseInt(str: String): Int? {
//    return str.toIntOrNull()
//}
//
//fun printProduct(arg1: String, arg2: String) {
//    val x = parseInt(arg1)
//    val y = parseInt(arg2)
//
//    // Using `x * y` yields error because they may hold nulls.
//    if (x != null && y != null) {
//        // x and y are automatically cast to non-nullable after null check
//        println(x * y)
//    }
//    else {
//        println("'$arg1' or '$arg2' is not a number")
//    }
//}
//
//fun main() {
//    printProduct("6", "7")
//    printProduct("a", "7")
//    printProduct("a", "b")
//}

fun main() {
 val list = listOf(null, 2,3,4,5)
    println( list.firstOrNull() ?: 0)
    val name: String? = null

    name?.let {
        println("Hello, $it") // prints "Hello, John"
    }
println("list size: ${list.size - 1}")

    var a = 1
    var b = 2
    a = b.also { b = a }
    println("a: $a")

    val names = listOf("Alice", "Bob", "Charlie", "Dave", "Eve")
    val result = names.joinToString(separator = " ||| ", prefix = "Names: ", postfix = "!") { it.uppercase() }
        .map { it.lowercase() }
    println(result)


}



fun transform(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}