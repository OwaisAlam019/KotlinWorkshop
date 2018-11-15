/*
* Array constructor is declared with specified size and init function.
* The init function is used to returns the elements of array with their index.
* Array(size: Int, init: (Int) -> T)
* */


fun main(args:Array<String>){

//    Array Initialization
    val array1 = Array(5, {0})
    array1.forEach { println(it) }
}