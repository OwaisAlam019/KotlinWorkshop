fun main(args: Array<String>) {
//    Defining variables
//    Assign-once (read-only) local variable:
    print("Please Enter a name: ")
    var name = readLine()
    print("please Enter Age: ")
    val age: Int = readLine()!!.toInt() // use !! so that it should not allow any null values from input

    var department: String? // "?" marks a type as nullable
    print("Enter a department name: ")
    department = readLine()

    println("Name: "+name)
    println("Age : "+age)
    println("Department: "+department)

}