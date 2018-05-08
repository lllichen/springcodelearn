
/**
 * Created by lichen@daojia.com on 2017-10-30.
 */
fun main(args: Array<String>) {
    println("Hello, world!")
    println("hello Kotlin is perfect");

    Greeter("lichen").greet();
}

class Greeter(val name: String) {
    fun greet() {
        println("Hello, ${name}");
    }
}
