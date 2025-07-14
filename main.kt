

import iSayHello// Single expression function
fun getGreeting() = "Hello Kotlin"

fun sayHello(){
    println(getGreeting())
}


fun iSayHello(name: String) {
    println("Hello $name")
}


fun main() {
    sayHello()
    iSayHello("Ritik")
    iSayHello("World")

}
