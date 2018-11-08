import java.util.*

fun main(args: Array<String>){
    //Input
    println("Enter your birth year please")
    var birthYear:Int = readLine()!!.toInt()

    //Process
    var currentYear = Calendar.getInstance().get(Calendar.YEAR)
    var age:Int = currentYear - birthYear

    //Output
    println("your age is $age")
}