package OOP
/*
    Primary Constructors
    Secondary  constructors
* */

class clothes {
    var clotheBrand:String = ""
    var clotheType:String = ""
    var clotheSize:String = ""
    var clotheWaist:Int? = null
    constructor(brand: String,type: String,size: String,waist:Int){
        clotheBrand = brand
        clotheType = type
        clotheSize = size
        clotheWaist = waist
        println("initializing with waist")
    }

    constructor(brand: String,type: String,size: String){
        clotheBrand = brand
        clotheType = type
        clotheSize = size
        println("initializing shirts")
    }
        fun showDetails(item:clothes){
            println("Brand ${item.clotheBrand}")
            println("Type ${item.clotheType}")
            println("size ${item.clotheSize}")
        }
}


fun main(args: Array<String>) {

    var shopItem = clothes("levis","jacket","small")

    var shopItem2 = clothes("levis","jacket","small",waist = 22)

    shopItem.showDetails(shopItem)

}