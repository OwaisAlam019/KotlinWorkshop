
/*
Returns and Jumps

Kotlin has three structural jump expressions:

    break. Terminates the nearest enclosing loop.
    continue. Proceeds to the next step of the nearest enclosing loop.
    return. By default returns from the nearest enclosing function or anonymous function.

* */
fun main(args:Array<String>){
    foo()
}

fun foo() {
   listOf(1, 2, 3, 4, 5).forEach lit@ {
        if (it == 3) return@lit // non-local return directly to the caller of foo()
        print(it)
    }
    println("this point is Unreachable")
}