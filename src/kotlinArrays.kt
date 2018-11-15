
fun main(args:Array<String>){
//    immutable collections
    var map = mapOf<Int,String>(1 to "Owais",22 to "ahsan")// mapof is immutable so we cannot set values after declaration
    map.get(2)

    var list = listOf(1,2,3,4,5)
    println("sublist "+list.subList(1,3))
    /*Let create an example of declaring and traversing set element using setOf() function.
    In this example we create a set of Int type non generic and another generic set of Any type.
    */
    val intSet = setOf(2,6,4,29,4,5)
    val mySet: Set<Any> = setOf(2,6,4,29,4,5,"Ashu","Ajay")
    println(".......print Int set.........")
    for(element in intSet){
        println(element)
    }
    println(".......print Any set.........")
    for(element in mySet){
        println(element)
    }


}