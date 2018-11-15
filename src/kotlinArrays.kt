/*
* Array constructor is declared with specified size and init function.
* The init function is used to returns the elements of array with their index.
* Array(size: Int, init: (Int) -> T)
* */


fun main(args:Array<String>){

    var arrayString = Array<String>(4){""}

    arrayString.forEachIndexed { index, s ->
        println("Enter a string")
        arrayString[index] = readLine()!!
    }
    println("String elements")
    for (item in arrayString){
        println(item)
    }

    println("Printing index wise")

    for (i in 0..3)
        println("array index $i and value "+arrayString[i])

}