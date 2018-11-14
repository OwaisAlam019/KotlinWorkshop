/*
Different ways to overload the method
There are two ways to overload the method in java
   1. By changing number of arguments
   2. By changing the data type
* */
fun adder(num1:Int,num2:Int)= num1+num2
fun adder(num1:Int,num2:Int,num3:Int)= num1+num2+num3

fun add(num1:Int,num2:Int):Int{
    return num1+num2
}
fun add(num1:Int,num2:Double):Double{
    return num1+num2
}
fun main(args:Array<String>){
//    Changing number of arguments
    println(adder(11,11))
    println(adder(11,11,11))
//    changing data types
    println(add(11,11))
    println(add(11,11.34))

//    Overloading is not possible by changing only return types
}