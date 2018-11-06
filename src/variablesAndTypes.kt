fun main(args: Array<String>) {
//    Defining variables
//    Assign-once (read-only) local variable:

    var a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred (deduce)
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred(put off)  assignment
    println("value of a is : $a"+" Value of b is : $b"+" value of c is : c")

    var name = "M.Ali"
    val age: Int = 20
    var department: String = "HR"

    println("Name: "+name)
    println("Age : "+age)
    println("Department: "+department)

}