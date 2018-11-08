
/*
when replaces the switch operator of C-like languages.
*/
fun main(args: Array<String>){
    print("enter the value of x")
    var x = readLine()!!.toInt()
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }

}