
/*
if branches can be blocks, and the last expression is the value of a block:
If you're using if as an expression rather than a statement (for example,
returning its value or assigning it to a variable),
the expression is required to have an else branch.
*/
fun main(args: Array<String>){
    var a = 10
    var b = 20
    val max = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }
    println("maximum value is $max")

}