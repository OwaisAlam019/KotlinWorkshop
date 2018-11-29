package OOP
/*
* Nested class is such class which is created inside another class.
* In Kotlin, nested class is by default static,
* so its data member and member function can be accessed without
* creating an object of class.
*Nested class cannot be able to access the data member of outer class.*/

class outer{
    private var name: String = "Owais"
    class netedClass{
        var description: String = "code inside nested class"
        private var id: Int = 101
        fun foo(){
//            print("name is ${name}") // cannot access the outer class member
            println("Id is ${id}")
        }
    }
}

fun main(args:Array<String>){

    var nestedObj = outer.netedClass()
    nestedObj.foo()
}