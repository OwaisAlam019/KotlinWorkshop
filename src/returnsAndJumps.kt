
/*
Returns and Jumps

Kotlin has three structural jump expressions:

    break. Terminates the nearest enclosing loop.
    continue. Proceeds to the next step of the nearest enclosing loop.
    return. By default returns from the nearest enclosing function or anonymous function.

* */
fun main(args:Array<String>){
   // break with nested loop and label

    loop@for (i in 1..3){
        for (ii in 1..3){
            if (ii==2)
                break@loop
            println("inner loop")
        }
    }
}