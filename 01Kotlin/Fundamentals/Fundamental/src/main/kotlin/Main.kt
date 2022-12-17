import kotlin.jvm.internal.Intrinsics.Kotlin

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
//fun sayHello(itemGreeting: String){
////    val msg = "Hello ${itemGreeting}"
//    val msg = "Hello $itemGreeting"
//    println(msg)
//}
fun sayHello(greeting: String?, itemGreeting: String) = println("$greeting,  $itemGreeting")

fun print(msg: String) = println(msg)

fun printElementsList(msg: String, itemsList: List<String>){
    itemsList.forEach { itemList -> println("$msg $itemList") }
}

fun printElementsList01(msg: String, vararg itemsList: String){
    itemsList.forEach { itemList -> println("$msg $itemList") }
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
    sayHello(null, "word")
    sayHello(null, "kotlin")
    sayHello("Key kotlin", "hello word")
    sayHello("Hey you", "hello")

//    Collection datatypes
    val interestingThings = arrayOf("Kotlin", "Programming", "Coffee")
    print(interestingThings.size.toString())
    print(interestingThings[0])
    print(interestingThings.get(0))

//    for each
    print("For each")
    for (interestingThing in interestingThings) {
        print(interestingThing)
    }

    print("For each for each element of the array")
//    interestingThings.forEach { print(it) }
    interestingThings.forEach { interestingThing -> println(interestingThing) }
    interestingThings.forEachIndexed { index, interestingThing -> print("$interestingThing is in the index $index") }

    val interestingStuffes = listOf("KothinList", "ProgrammignList", "CoffeeList")
    interestingStuffes.forEachIndexed { index, s -> print("$s at the index $index")  }

    val map = mapOf(1 to "a", 2 to "b", 3 to  "c")
    map.forEach { key, value -> print("$key -> $value")}


    val interestingThings01 = mutableListOf("Kotlin", "Programming", "Coffee")
    interestingThings01.add("dog")
    println(interestingThings01)

    val map01 = mutableMapOf(1 to "a", 2 to "b", 3 to  "c")
    map01.put(4, "d")
    println(map01)

    printElementsList("Hi ", interestingStuffes)
    printElementsList01("Hi", "Kotlin", "Programming")

//    What happen if I want ot sent a existing array to the function
    val interestingThings02 = arrayOf("Hola", "Kotlin", "Hey")
//    printElementsList01("Hi", interestingThings02) // this cause a error we have to use * like C
    println()
    print("Print elements using *")
    printElementsList01("Hi", *interestingThings02)
    printElementsList01(itemsList = *interestingThings02, msg = "Hi " )

}





