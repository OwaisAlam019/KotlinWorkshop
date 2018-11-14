fun sum(n1:Int,n2:Int): Int{
    return n1+n2
}

fun defaultArgument(n1:Int=22,n2:Int=23,qux:()->Unit){
    println("n1 is $n1")
    println("n2 is $n2")
    qux()

}

fun main(args:Array<String>){

    var sum = sum(1,2)
    println("Sum is $sum");

    //calling default argument Functions
    defaultArgument(){ print("Hello")}
}