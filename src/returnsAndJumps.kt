
/*
Returns and Jumps

Kotlin has three structural jump expressions:

    break. Terminates the nearest enclosing loop.
    continue. Proceeds to the next step of the nearest enclosing loop.
    return. By default returns from the nearest enclosing function or anonymous function.

* */
fun main(args:Array<String>){

    print("Enter your name")
    var name: String? = readLine() // replace readline with null to see what happens
//    val s: String?
//    if (name!=null)
//        s = name
//    else
//        throw  IllegalArgumentException("Name required")
    val s = name ?: throw IllegalArgumentException("Name requirement")

    println(s)     // 's' is known to be initialized at this point
}