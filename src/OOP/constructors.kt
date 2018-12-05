package OOP
/*
    Primary Constructors
    Secondary  constructors
* */

class clothes (val brand:String,val type:String,val size:String) {

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