package OOP

open class operators{
   open fun sum(n1:Int,n2:Int):Int{
        return n1+n2
    }
    fun sub(n1:Int,n2:Int):Int{
        return n2 - n1
    }
}

class mulOperators():operators() {
   override fun sum(n1:Int,n2:Int):Int{
        return n1+n2 +3
    }    fun mul(n1:Int,n2:Int):Int{
        return n1*n2
    }
    fun div(n1:Int,n2:Int):Int{
        return n2/ n1
    }
}
fun main(args: Array<String>) {
    var op = mulOperators()
    var op2 = operators ()

    println("Sum :"+op2.sum(2,3))
    println("Multiply "+op.mul(2,4))

}