
fun main(args:Array<String>){
    println("Enter your Town Name")
    var townName:String = readLine()!!

    var postalCode = when(townName){
        "PECHS","DHA" -> 1565
        "Gulshan","Johar" -> 6776
        else ->"Invalid Input"
    }

    if(postalCode!="Invalid Input")
        println("Your postal code is $postalCode")
    else
        println(postalCode)
}