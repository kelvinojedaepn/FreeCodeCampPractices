//fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//}

//var greeting:String? = null

//fun getGreeting(): String{
//    return "Hello Kotlin"
//}

//fun getGreeting() = "Hello Kotlin"

//fun sayHello() = println("Hello Kotlin")
fun sayHello(itemGreeting: String){
//    val msg = "Hello ${itemGreeting}"
    val msg = "Hello $itemGreeting"
    println(msg)
}

fun main() {
//    var variable: String = "Kelvin"
//    "Juan".also { variable = it }
//    variable += "Maria"
//    println(variable)

//    greeting = "Maria"
//
//    println(greeting)
//    if(greeting != null){
//        println(greeting)
//    }else{
//        println("Hi")
//    }
//      Operation greeting similar in when
//    greeting = "Hello"
//    when(greeting){
//        null-> println("hi")
//        else-> println(greeting)
//    }
//    greeting = "Kelvin"
//    val greetingPrint = if(greeting != null) greeting else "hi if on one line"
//    println(greetingPrint)
//    val greetingWhen = when(greeting){
//        null -> "Hi when"
//        else -> greeting
//    }
//    println(greetingWhen)
//     print(getGreeting())
    sayHello("word")
    sayHello("kotlin")
}



