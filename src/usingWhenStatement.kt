
fun main(args:Array<String>){
    println("Enter your marks")
    var marks:Int = readLine()!!.toInt()

    var grade = when(marks){
        in 50..60 -> "C grade"
        in 61..70 -> "B grade"
        in 71..80 -> "A grade"
        in 81..100 -> "A1 grade"
        else -> "Fail"
    }

    println("Your grade is $grade")
}