/*
Priorities
1. ()   paranthesis
2. ^    power
3. *,/  Multiplication & division
4. +,-  Add & subtract
5. =    Assignment
* */
fun main(args: Array<String>){
    var num1:Int = 10
    var num2:Int = 10
    var num3:Int = 5
    var sum:Int?

    sum = (num1+num2)*num3-4

    println(sum)

}