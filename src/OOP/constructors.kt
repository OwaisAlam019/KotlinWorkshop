package OOP
/*
    Primary Constructors
    Secondary  constructors
* */

class clothes (val brand:String,val type:String,val size:String) {
    /*
    * The primary constructor cannot contain any code.
    * Initialization code can be placed in initializer blocks, which are prefixed with the init keyword.*/
    var discount:Int = 0

    init {
        println("Cloth object created for brand ${brand}")
        if (size=="small"){
            discount = 20
            println("You get $discount % discount")
        }

    }
        fun showDetails(){
            println("Brand $brand")
            println("Type $type")
            println("size $size")
        }
}


fun main(args: Array<String>) {

    var shopItem = clothes("levis","jacket","small")
    shopItem.showDetails()

}