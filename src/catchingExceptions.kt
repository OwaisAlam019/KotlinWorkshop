fun main(args: Array<String>){

    try {
        println("Enter a number")
        var n1:Int = readLine()!!.toInt()
        var n2 =100/n1
        println("Value $n2")
    }catch (ex:Exception){
        println(ex.message)
        println("Please input correct number")
    }
}