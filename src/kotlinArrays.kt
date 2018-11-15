/*
* Array constructor is declared with specified size and init function.
* The init function is used to returns the elements of array with their index.
* Array(size: Int, init: (Int) -> T)
* */


fun main(args:Array<String>){

//    Array initialization with lambda
    val asc = Array(5, { index -> (index +index ) })
    asc.forEach { println(it) }
}