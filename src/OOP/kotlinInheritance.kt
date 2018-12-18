package OOP

open class operator{
  protected var  processName:String? = null // change modifier to public private protected
    fun sum(n1:Int,n2:Int):Int{
        return n1+n2
    }
    fun sub(n1:Int,n2:Int):Int{
        return n2 - n1
    }
}

class mulOperator():operator() {
    init {
        super.processName = "Multiply and divide"
    }
    fun mul(n1:Int,n2:Int):Int{
        return n1*n2
    }
    fun div(n1:Int,n2:Int):Int{
        return n2/ n1
    }
}
fun main(args: Array<String>) {
    var op = mulOperator()
    println("Sum :"+op.sum(2,3))
    println("Multiply "+op.mul(2,4))

}