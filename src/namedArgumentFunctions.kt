
fun printEmployeeDetails(name:String="John",age:Int=23,department:String = "SQA"){
    println("MR/MRS $name is $age years old and working in  $department department")
}

fun main(args: Array<String>) {
    printEmployeeDetails(age = 33)
}