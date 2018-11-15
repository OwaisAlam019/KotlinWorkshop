
fun main(args:Array<String>){

    var title = "Welcome to Kotlin training"

    println("title "+title) //concatenation
    println("title $title")

    var firstname ="Owais"
    var lastname  ="Alam"
    var fullName = firstname+" "+lastname //concatenation

    //properties
    //length
    println("Length of string is "+fullName.length)

    //indices
    println("indices of string are "+fullName.indices)

    //lastIndex
    println("LastIndex"+fullName.lastIndex)

//    Some commonly used funcitons
//    Compare
    /*
    * It compares the current object with specified object for order.
    * It returns zero if current is equals to specified other object.*/
    println("Compare "+fullName.compareTo(fullName))

//    get returns the character at given index from the current character sequence.
    println("Get "+fullName.get(3))

//    It returns the concatenate string with the string representation of the given other string.
    println("Plus function"+fullName.plus(lastname))

//    returns true if the character sequence contains the other specified character sequence.
    println("Contains "+fullName.contains(lastname))

    println("name in upper case "+fullName.toUpperCase())
    println("name in lower case "+fullName.toLowerCase())

    println("name in splitted string "+fullName.split(" "))

    println("name in trim "+fullName.trim()) // clears extra spaces from start and end of the string


}