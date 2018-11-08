import java.lang.Integer.parseInt

/*
We can use arbitrary expressions (not only constants) as branch conditions
 */
fun main(args: Array<String>){
    print("enter the value of x")
    var x = readLine()!!.toInt()
    var s = "3"
    when (x) {
        parseInt(s) -> print("s encodes x")
        else -> print("s does not encode x")
    }

}