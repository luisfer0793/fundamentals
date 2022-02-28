fun add(a: Int, b: Int): Int {
	return a + b
}

fun greet(name: String, message: String): String {
	return "Hi, $name. $message"
}

fun main() {
	val name = "Fernando"
	val message = "This is my first kotlin message"
	println(greet(name, message))
	println("The result of sum 10 + 10 is: ${add(10, 10)}")
}