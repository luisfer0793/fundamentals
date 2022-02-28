fun add(a: Int, b: Int): Int {
	return a + b
}

fun greet(name: String, message: String): String {
	return "Hi, $name. $message"
}

const val OS = "Windows"
const val name = "Fernando"
const val message = "This is my first kotlin message"
const val age = 28
const val initialLetter = 'F'
val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

fun main() {
	val names = arrayOf("Nidia", "Gaby", "Brenda", "Luis")
	println(greet(name, message))
	println("The result of sum 10 + 10 is: ${add(10, 10)}")
	println("The initial letter of $name is $initialLetter")
	println("I'm $age years old")
	val filteredNames = names.filter { name -> name.contains("a") }
	val sumOfEvenNumbers = numbers.filter { number -> number % 2 != 0 }.sum()
	println(filteredNames)
	println(sumOfEvenNumbers)
}