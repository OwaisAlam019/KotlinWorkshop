/*
Priorities
1. ()    paranthesis
2. ++,-- pre-increement / pre-decreement
3. ^     power
4. *,/   Multiplication & division
5. +,-   Add & subtract
6. =     Assignment
7. ++,-- post-increement / post-decreement
* */
fun main(args: Array<String>){
    var num1:Int = 10
    var num2:Int = 20
    var result:Int?

    result = ++num1+num2
    println("the result of pre increement is : $result")

    result = num1++ + num2

    println("the result of post increement is: $result")
    println("the value of num1 is : $num1")

}