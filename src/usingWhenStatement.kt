
fun main(args:Array<String>){
    println("Enter your marks")
    var marks:Int = readLine()!!.toInt()

    var grade:String?
    when(marks){
        in 50..60 -> grade = "C grade"
        in 61..70 -> grade ="B grade"
        in 71..80 -> grade ="A grade"
        in 81..100 ->grade = "A1 grade"
        else -> grade ="Fail"
    }

    println("Your grade is $grade")
}