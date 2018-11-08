
/*
when replaces the switch operator of C-like languages.
*/
fun main(args: Array<String>){
    print("enter the value of x")
    var x = readLine()!!.toInt()
    when (x) {
            0, 1  -> print("x == 0 or x == 1 or x == 2")
        else ->  // Note the block
            print("x is neither 0 nor 1")
    }

}