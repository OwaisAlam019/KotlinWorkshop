
/*
checking a value for being in a range
 */
fun main(args: Array<String>){
    print("enter the value of x")
    var x = readLine()!!.toInt()
    when (x) {
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }

}